package Level3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    private Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void addTest() {
        double [] a = {3.2, 563.5, 3.9, 3245.5, 2435.3};
        double [] b = {2.0, 3.5, 4.9, 3000000.2331049, 123.3145};
        assertThat(a.length).isEqualTo(b.length);

        for(int i = 0; i < a.length; i++) {
            double result = c.add(a[i], b[i]);
            double expected = a[i] + b[i];
            assertThat(result).isEqualTo(expected);
        }
    }

    @Test
    void subtractTest() {
        double [] a = {2.0, 3.5, 4.9, 325.5, 25.3};
        double [] b = {2.0, 23.6, 43245.5, 3245.5, 235.3};
        assertThat(a.length).isEqualTo(b.length);
        for(int i = 0; i < a.length; i++) {
            double result = c.subtract(a[i], b[i]);
            double expected = a[i] - b[i];
            assertThat(result).isEqualTo(expected);
        }
    }

    @Test
    void multiplyTest() {
        double [] a = {2.0, 3.5, 5.0, 3245.5, 435.3};
        double [] b = {2.0, 3.5, 4.0, 345.5, 2435.0};
        assertThat(a.length).isEqualTo(b.length);
        for(int i = 0; i < a.length; i++) {
            double result = c.multiply(a[i], b[i]);
            double expected = a[i] * b[i];
            assertThat(result).isEqualTo(expected);
        }
    }

    @Test
    void divideTest() {
        double [] a = {2.0, 3.5, 5.0, 3245.5, 435.3};
        double [] b = {2.0, 3.5, 4.0, 345.5, 2435.0};
        assertThat(a.length).isEqualTo(b.length);
        for(int i = 0; i < a.length; i++) {
            double result = c.divide(a[i], b[i]);
            double expected = a[i] / b[i];
            assertThat(result).isEqualTo(expected);
        }

        assertThatThrownBy(() -> c.divide(a[0], 0.0)).isInstanceOf(ArithmeticException.class);
    }
}
