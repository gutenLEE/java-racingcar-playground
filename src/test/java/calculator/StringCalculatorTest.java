package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @author gutenlee
 * @since 2022/09/04
 */
public class StringCalculatorTest {


    @Test
    void splitAndSum_빈문자_또는_null() throws Exception {
        assertThat(StringAddCalculator.splitAndSum("")).isEqualTo(0);

        assertThat(StringAddCalculator.splitAndSum(null)).isEqualTo(0);
    }

    @Test
    void splitAndSum_숫자하나() throws Exception {
        assertThat(StringAddCalculator.splitAndSum("1")).isEqualTo(1);
    }


    @Test
    public void splitAndSum_쉼표구분자() throws Exception {
        int result = StringAddCalculator.splitAndSum("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void splitAndSum_쉼표_또는_콜론_구분자() throws Exception {
        int result = StringAddCalculator.splitAndSum("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_custom_구분자() throws Exception {
        int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_negative() throws Exception {
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }




}
