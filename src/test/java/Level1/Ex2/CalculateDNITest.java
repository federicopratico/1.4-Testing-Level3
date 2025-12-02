package Level1.Ex2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDNITest {
    @ParameterizedTest
    @ValueSource(strings = {"37405635-E", "75845820-P", "99116349-B", "32775365-C", "49414654-M", "41798990-D", "27176871-W", "17034270-X", "60891933-P", "67313499-C"})
    void TestDNICalculator(String DNI) {
        char cDNI = DNI.trim().charAt(DNI.trim().length()-1);

        assertEquals(cDNI, CalculateDNI.calculate(DNI));
    }
}