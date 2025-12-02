package Level2.Ex1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test1 {
    @Test
    public void testEqual(){
        String str1 = "abc";
        String str2 = "abc";

        assertThat(str1).isEqualTo(str2);
    }

    @Test
    public void testNotEqual(){
        String str1 = "abc";
        String str2 = "acb";

        assertThat(str1).isNotEqualTo(str2);
    }
}
