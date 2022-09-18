package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NameTest {
    @Test
    void create() throws Exception {
        Name po = new Name("po");
        assertThat(po).isEqualTo(new Name("po"));
    }


}