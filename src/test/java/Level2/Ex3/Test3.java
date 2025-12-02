package Level2.Ex3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test3 {


    @Test
    void testEqualsArray() {
        int [] a = {1,2,3,4,5};
        int [] b = {1,2,3,4,5};

        assertThat(a).hasSameSizeAs(b);
        assertThat(a).isEqualTo(b);
        assertThat(a).containsExactly(b);
    }
}
