package racingcar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gutenlee
 * @since 2022/09/14
 */
public class RacingGame {
    // 일급콜렉션 포장해라
    private final List<Car> cars;
    private int tryNo;

    public RacingGame(String carNames) {
        String[] names = carNames.split(",");
        this.cars = new ArrayList<>();
        for (String name : names) {
            this.cars.add(new Car(name, 2));
        }

    }

    public void moveCars() {
        for (int i = 0; i < tryNo; i++) {
            for (Car car : cars) {
                car.move(new RandomMovingStrategy());
            }
        }
    }
}
