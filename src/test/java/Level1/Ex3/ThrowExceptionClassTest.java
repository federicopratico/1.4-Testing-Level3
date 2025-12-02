package Level1.Ex3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThrowExceptionClassTest {
    private ThrowExceptionClass t;

    @BeforeEach
    void setup() {
        t = new ThrowExceptionClass();
    }

    @Test
    @DisplayName("Catching IndexOutOfBound exception")
    void catchingIndexOutOfBoundTest() {
        IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class, () -> t.get(6));
    }
}