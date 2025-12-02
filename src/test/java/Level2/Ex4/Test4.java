package Level2.Ex4;

import Leve2.Ex4.Book;
import Leve2.Ex4.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class Test4 {
    private ArrayList<Object> objects;

    @BeforeEach
    void setUp() {
        objects = new ArrayList<>();
    }

    @Test
    void InsertionOrderTest() {
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Jane", "Doe");
        Book b1 = new Book("Huxley", "A brave new world");
        String s = new String("ssssss");
        Integer i = 10;

        objects.add(p1);
        objects.add(p2);
        objects.add(b1);
        objects.add(s);

        assertThat(objects).containsExactly(p1, p2, b1, s);

        assertThat(objects).containsExactlyInAnyOrder(s, p2, b1, p1);

        assertThat(objects).containsOnlyOnce(s);

        assertThat(objects).doesNotContain(i);
    }
}
