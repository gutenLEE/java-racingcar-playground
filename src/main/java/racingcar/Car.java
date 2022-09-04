package racingcar;

import java.util.StringJoiner;

/**
 * @author gutenlee
 * @since 2022/09/04
 */
public class Car {
    private String name;
    private int currentPosition;

    public Car(String name) {
        if (name.length() > 5)
            throw new RuntimeException();
        this.name = name;
        this.currentPosition = 1;
    }

    public void move(int moveForwardCondition){
        if (moveForwardCondition >= 4)
            currentPosition++;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("");
        for (int i = 1; i <= this.currentPosition; i++) {
            sj.add("-");
        }
        return this.name + " : " + sj.toString();
    }
}
