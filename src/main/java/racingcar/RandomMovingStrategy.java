package racingcar;

import java.util.Random;

/**
 * @author gutenlee
 * @since 2022/09/15
 */
public class RandomMovingStrategy implements MovingStrategy {

    private final static int FORWARD_NUM = 4;
    private final static int MAX_BOUND = 10;

    @Override
    public boolean movable() {
        return getRandomNo() >= FORWARD_NUM;
    }

    private int getRandomNo(){
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
