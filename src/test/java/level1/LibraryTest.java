package level1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LibraryTest {

    private Library library;


    @BeforeEach
    public void setUp() {

        library = new Library();
        library.addBook("El Señor de los Anillos");
        library.addBook("El Quijote");
        library.addBook("Don Juan Tenorio");
    }


    @Test
    @DisplayName("Library is not null after creation")
    public void testLibraryIsNotNullAfterCreation() {
        library = new Library();
        assertNotNull(library.getBooks());
    }


    @Test
    @DisplayName("Library size is as expected after adding books")
    public void testLibrarySizeAfterAddingBooks() {
        library.addBook("Cien años de soledad");
        assertEquals(4, library.getBooks().size());
    }
    @Test
    @DisplayName("Library contains book at position")
    public void testLibraryContainsBookAtPosition() {
        assertEquals("El Quijote", library.getBookAtPosition(1));
    }
    @Test
    @DisplayName("Library does not contain duplicate books")
    public void testLibraryDoesNotContainDuplicateBooks(){
        library.addBook("El Quijote");
        assertEquals(3, library.getBooks().size());
    }

    @Test
    @DisplayName("Library can get book at position")
    public void testGetBookAtPosition(){

        assertEquals("El Quijote", library.getBookAtPosition(1));
        assertEquals("El Señor de los Anillos", library.getBookAtPosition(2));
        assertEquals("Don Juan Tenorio", library.getBookAtPosition(0));
    }


    @Test
    @DisplayName("Library is modified after adding books")
    public void testLibraryIsModifiedAfterAddingBooks() {

        assertEquals("El Quijote", library.getBookAtPosition(1));
        assertEquals("El Señor de los Anillos", library.getBookAtPosition(2));
        assertEquals("Don Juan Tenorio", library.getBookAtPosition(0));
    }

    @Test
    @DisplayName("Library size is as expected after removing books")
    public void testLibrarySizeAfterRemovingBooks() {
        library.removeBook("El Quijote");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    @DisplayName("Library is sorted after adding books")
    public void testLibraryIsSortedAfterAddingBooks() {

        assertEquals("Don Juan Tenorio", library.getBookAtPosition(0));
        assertEquals("El Quijote", library.getBookAtPosition(1));
        assertEquals("El Señor de los Anillos", library.getBookAtPosition(2));
    }

}
