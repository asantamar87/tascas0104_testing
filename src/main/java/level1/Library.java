package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    //Implementa les següents funcionalitats:
    //
    //    La classe ha de permetre afegir llibres a la col·lecció.
/*    public void addBook(String title) {
        if (books.contains(title)) {
            throw new IllegalArgumentException("Book already exists");
        }
        books.add(title);
       Collections.sort(books);

    }*/

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books);
        }
    }

    //    S'ha de poder recuperar la llista completa de llibres
    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    //    S'ha de poder obtenir el títol d'un llibre donada una posició.
    public String getBookAtPosition(int position) {
        if (position < 0 || position >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        return books.get(position);
    }
    //    S'ha de poder afegir un llibre en una posició específica.
    public void addBookAtPosition(int position, String title) {
        if (position < 0 || position > books.size()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (!books.contains(title)) {
            books.add(position, title);
            Collections.sort(books);
        }
    }
    //    S'ha de poder eliminar un llibre per títol.
    public boolean removeBook(String title) {
        boolean removed = books.remove(title);
        if (!removed) {
            throw new IllegalArgumentException("Book not found");
        }

        return removed;

    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
