package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gutenlee
 * @since 2022/09/04
 */
public class StringAddCalculator {


    public static int splitAndSum(String input){
        if (input == null) return 0;

        String[] tokens;
        if (input.contains(":")|| input.contains(",")) {
            tokens = input.split(":|,");
            return sum(tokens);
        }
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (m.find()) {
            String customDelimiter = m.group(1);
            tokens= m.group(2).split(customDelimiter);
            return sum(tokens);
        }
        return sum(new String[] {input});
    }

    public static int sum(String[] tokens) {
        int result = 0;
        for (String token : tokens) {
            result += toInt(token);
        }
        return result;
    }

    private static int toInt(String token) {
        int num = Integer.parseInt(token);
        if (num < 0)
            throw new RuntimeException();
        return num;
    }


}
