package Level1.Ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestLibrary {
    private Library library;

    @BeforeEach
    @DisplayName("Creating a new fresh library after each test")
    void createNewLibraryObject() {
        library = new Library();
    }

    @Test
    @DisplayName("Verify that the BookList in not null after creating a new object")
    void notNullLibraryAndBookListTest() {
        assertNotNull(library);
        assertNotNull(library.retrieveBookList());
    }

    @Test
    @DisplayName("List size modified after insertion")
    void insertionTest() {
        assertEquals(0, library.retrieveBookList().size());

        library.addBook("The Night Circus");
        library.addBook("Sapiens: A Brief History of Humankind");
        library.addBook("1984");
        library.addBook("Algorithms to live by");

        assertEquals(4, library.retrieveBookList().size());
    }

    @Test
    @DisplayName("Ensure that the list contains a specific book in its correct position")
    void correctPositionOfBookTest() {
        library.addBook("Animal Farm");
        library.addBook("Brave New World");
        library.addBook("1984");

        String bookAtPosition1 = library.getBookByPosition(1);
        assertEquals("Animal Farm", bookAtPosition1);
    }

    @Test
    @DisplayName("No duplicate book titles in the list")
    void noDuplicateTitlesTest() {
        library.addBook("A brave new world");
        library.addBook("A brave new world");
        library.addBook("A brave new world");

        List<Book> bookList = library.retrieveBookList();
        assertEquals(1, bookList.size());
        assertEquals(3, bookList.get(0).getQuantity());
    }

    @Test
    @DisplayName("A book title can be retrieved given a specific position")
    void retrieveBookTitleByPositionTest() {
        library.addBook("A brave new world");
        library.addBook("1984");
        library.addBook("Christmas's Tales");

        assertEquals("1984", library.getBookByPosition(0));
    }

    @Test
    @DisplayName("Ensure that adding a book correctly modify the list")
    void addABookCorrectlyModifyTheListTest() {
        int initialSize = library.retrieveBookList().size();
        library.addBook("A brave new world");
        int newSize = library.retrieveBookList().size();
        assertNotEquals(initialSize, newSize);
        assertEquals(initialSize+1, newSize);
    }

    @Test
    @DisplayName("Confirm that removign a book decrease the size of the list")
    void removingABookTest() {
        library.addBook("A brave new world");
        library.addBook("1984");
        library.addBook("1984");
        library.addBook("Christmas's Tales");

        int initialSize = library.retrieveBookList().size();
        library.removeBookByTitle("1984");
        int sizeAfterRemoving = library.retrieveBookList().size();
        assertEquals(initialSize, sizeAfterRemoving);

        library.removeBookByTitle("1984");
        sizeAfterRemoving = library.retrieveBookList().size();
        assertNotEquals(initialSize, sizeAfterRemoving);
        assertEquals(initialSize-1, sizeAfterRemoving);
    }

    @Test
    @DisplayName("Verify that the list remains alphabetically sorted after adding a book")
    void alphabeticallyOrderingAfterAddingABookTest() {
        library.addBook("A brave new world");
        library.addBook("1984");
        library.addBook("1984");
        library.addBook("Christmas's Tales");

        List<Book> afterAdding = library.retrieveBookList();

        assertEquals("1984", afterAdding.get(0).getName());
        assertEquals("A brave new world", afterAdding.get(1).getName());
        assertEquals("Christmas's Tales", afterAdding.get(2).getName());
    }

    @Test
    @DisplayName("Verify that the list remains alphabetically sorted after removing a book")
    void alphabeticallyOrderingAfterRemovingABookTest() {
        library.addBook("A brave new world");
        library.addBook("1984");
        library.addBook("1984");
        library.addBook("Christmas's Tales");

        List<Book> afterAdding = library.retrieveBookList();

        assertEquals("1984", afterAdding.get(0).getName());
        assertEquals("A brave new world", afterAdding.get(1).getName());
        assertEquals("Christmas's Tales", afterAdding.get(2).getName());

        library.removeBookByTitle("A brave new world");

        List<Book> afterRemoving = library.retrieveBookList();

        assertEquals("1984", afterRemoving.get(0).getName());
        assertEquals("Christmas's Tales", afterRemoving.get(1).getName());
    }

}
