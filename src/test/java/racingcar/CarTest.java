package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @author gutenlee
 * @since 2022/09/14
 */
public class CarTest {
    @Test
    void carTest() throws Exception {
        Car car = new Car("ab", 2);
        assertThat(car.getName()).isEqualTo("ab");
    }

    @Test
    void carNameErrorTest_If_length_of_name_is_over_5() throws Exception {
        assertThatThrownBy(() -> new Car("aaabbb", 2));
    }

    @Test
    void moveForwardTest() throws Exception {
        Car car = new Car("ab", 2);
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(1);
    }

}
