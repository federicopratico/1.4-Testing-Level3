package Level2.Ex6;

import Level1.Ex3.ThrowExceptionClass;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Test6 {
    ThrowExceptionClass e = new ThrowExceptionClass();

    @Test
    void isThereAnExceptionTest() {
        assertThatThrownBy(() -> e.get(6)).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
