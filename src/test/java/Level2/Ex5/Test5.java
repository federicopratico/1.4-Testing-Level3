package Level2.Ex5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Test5 {
    private Map<String, String> countriesAndCapitals;

    @BeforeEach
    void setUp() {
        countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("USA", "United States");
        countriesAndCapitals.put("Canada", "United Kingdom");
    }

    @Test
    void isThereAKeyTest() {
        assertThat(countriesAndCapitals).containsKey("USA");
    }
}
