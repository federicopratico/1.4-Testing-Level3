package Level1.Ex1;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;
    private int quantity;

    public Book(String name) {
        if(name == null) throw new IllegalArgumentException("Provide a name for the book");

        this.name = name;
        quantity = 1;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addOneCopy() {
        quantity++;
    }

    public void removeOneCopy() {
        quantity--;
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;

        Book o = (Book) obj;

        return name.equalsIgnoreCase(o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name.toLowerCase());
    }

    @Override
    public int compareTo(Book o) {
        return name.compareToIgnoreCase(o.name);
    }
}
