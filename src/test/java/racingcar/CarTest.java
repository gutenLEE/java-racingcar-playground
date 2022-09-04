package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @author gutenlee
 * @since 2022/09/04
 */
public class CarTest{
    @Test
    void carName_5글자_이하() throws Exception {
        assertThatThrownBy(() -> new Car("123456"))
                .isInstanceOf(RuntimeException.class);
    }


    @Test
    void when_over_4_자동차는_전진_갸능() throws Exception {
        Car car = new Car("토비");
        car.move(4);
        assertThat(car.getCurrentPosition()).isEqualTo(2);
    }

    @Test
    void 자동차_현재_위치_출력() throws Exception {
        Car car = new Car("토비");
        car.move(4);
        assertThat(car.toString()).isEqualTo("토비 : --");
    }

    @Test
    void 참가_자동차_생성() throws Exception {
        Racing racing = new Racing(Arrays.asList("토비", "백기선", "김영한"));
        racing.setMoveCount(5);
        racing.race();
    }




}
