package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books);
        }
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public String getBookAtPosition(int position) {
        if (position < 0 || position >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        return books.get(position);
    }
    public void addBookAtPosition(int position, String title) {
        if (position < 0 || position > books.size()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (!books.contains(title)) {
            books.add(position, title);
            Collections.sort(books);
        }
    }
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
