package Level2.Ex7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test7 {
    String s = new String();

    @Test
    void isEmptyTest() {
        assertThat(s).isEmpty();
    }
}
