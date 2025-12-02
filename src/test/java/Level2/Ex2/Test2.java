package Level2.Ex2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test2 {
    @Test
    void testSameReference(){
        String str1 = "abc";
        String str2 = str1;

        assertThat(str1).isSameAs(str2);
    }

    @Test
    void testDifferentReference(){
        String str1 = "abc";
        String str2 = new String(str1);

        assertThat(str1).isNotSameAs(str2);
    }
}
