package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author gutenlee
 * @since 2022/09/04
 */
public class Racing {
    private List<Car> racingCars;
    private int moveCount;

    public Racing(List<String> racingCarNames) {
        List<Car> racingCars = new ArrayList<>();
        for (String carName : racingCarNames) {
            Car car = new Car(carName);
            racingCars.add(car);
        }
        this.racingCars = racingCars;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public void race(){
        for (int i = 0; i < moveCount; i++) {
            process();
        }
        getWinners();
    }

    private void getWinners() {
        Car winner = this.racingCars.stream()
                .max(Comparator.comparing(Car::getCurrentPosition))
                .get();

        String winners = this.racingCars.stream()
                .filter(car -> car.getCurrentPosition() == winner.getCurrentPosition())
                .map(Car::getName)
                .reduce((a, b) -> a + " " + b)
                .get();
        System.out.println(winners + "가 최종우승했습다~~");
    }

    private void process(){
        for (Car racingCar : racingCars) {
            int moveForward = (int)(Math.random() * 9) + 1;
            racingCar.move(moveForward);
            System.out.println(racingCar);
        }
        System.out.println();
    }
}
