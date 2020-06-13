package io.github.fatihbozik.genericsandcollections;

import java.util.HashMap;
import java.util.Map;

class Book {
    private final String isbn;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public boolean equals(Object o) {
        return (o instanceof Book && ((Book) o).isbn.equals(this.isbn));
    }

    public int hashCode() {
        return 100;
    }

    // ... setters and getters
}

class BookStore {
    Map<Book, Integer> map = new HashMap<>();

    public BookStore() {
        Book b = new Book("A111");
        map.put(b, 10);
        b = new Book("B222");
        map.put(b, 5);
    }

    Integer getNumberOfCopies(Book b) {
        return map.get(b);
    }

    public static void main(String[] args) {
        BookStore bs = new BookStore();
        Book b = new Book("A111");
        System.out.println(bs.getNumberOfCopies(b));  //1
    }

}
