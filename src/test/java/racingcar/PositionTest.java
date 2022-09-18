package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @author gutenlee
 * @since 2022/09/15
 */
public class PositionTest {

    @Test
    void create() throws Exception {
        Position position = new Position(3);
        assertThat(position.getPosition()).isEqualTo(3);
    }

    @Test
    void object_equal_test() throws Exception {
        Position position = new Position(3);
        assertThat(position).isEqualTo(new Position(3));
    }

    @Test
    void valid_test() throws Exception {
        assertThatThrownBy(() -> {
            new Position(-1);
        });
    }

    @Test
    void move() throws Exception {
        Position position = new Position(3);
        assertThat(position.move()).isEqualTo(new Position(4));
    }






}
