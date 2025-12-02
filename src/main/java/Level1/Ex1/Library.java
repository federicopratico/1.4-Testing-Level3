package Level1.Ex1;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String bookName) {
        Book tmp = new Book(bookName);
        int index;
        if((index = books.indexOf(tmp)) < 0) {
            books.add(tmp);
        } else {
           books.get(index).addOneCopy();
        }

        Collections.sort(books);
    }

    public List<Book> retrieveBookList() {
        return new ArrayList<>(books);
    }

    public String getBookByPosition(int pos) {
        return books.get(pos).getName();
    }

    public void removeBookByTitle(String bookName) {
        Book tmp = new Book(bookName);
        int index;

        if((index = books.indexOf(tmp)) < 0) {
            throw new NoSuchElementException("The book to delete doesn't exist.");
        }

        if(books.get(index).getQuantity() > 1) books.get(index).removeOneCopy();
        else {
            books.remove(index);
        }

        Collections.sort(books);
    }
}
