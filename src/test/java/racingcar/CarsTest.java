package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @Test
    void findWinners() throws Exception {
        Car pobi = new Car("pobi", 2);
        Car crong = new Car("crong", 2);
        Car park = new Car("park", 1);

        Cars cars = new Cars(Arrays.asList(pobi, crong, park));
        assertThat(cars.findWinners()).containsExactly(pobi, crong);

    }



}