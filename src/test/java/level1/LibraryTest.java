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
    }



    //Verifica el seu correcte funcionament amb JUnit:
    //
    //    Verifiquen que la llista de llibres no és nul·la després de crear un nou objecte.

    @Test
    @DisplayName("Library is not null after creation")
    public void testLibraryIsNotNullAfterCreation() {
        assertNotNull(library.getBooks());
    }

    //    Confirmen que la llista té una mida esperada després d'inserir diversos llibres.

    @Test
    @DisplayName("Library size is as expected after adding books")
    public void testLibrarySizeAfterAddingBooks() {
        library.addBook("El Quijote");
        library.addBook("El Señor de los Anillos");
        library.addBook("Don Juan Tenorio");
        assertEquals(3, library.getBooks().size());
    }
    //    Asseguren que la llista conté un llibre específic en la seva posició correcta.
    @Test
    @DisplayName("Library contains book at position")
    public void testLibraryContainsBookAtPosition() {
        //ordena alfabeticamente la lista
        library.addBook("El Quijote");
        library.addBook("El Señor de los Anillos");
        library.addBook("Don Juan Tenorio");
        assertEquals("El Quijote", library.getBookAtPosition(1));

    }
    //    Verifiquen que no hi ha títols de llibres duplicats a la llista.
    @Test
    @DisplayName("Library does not contain duplicate books")
    public void testLibraryDoesNotContainDuplicateBooks(){
        library.addBook("El Quijote");
        library.addBook("El Quijote");
        assertEquals(1, library.getBooks().size());

    }

    //    Comproven que es pot recuperar el títol d'un llibre donada una posició específica.
    @Test
    @DisplayName("Library can get book at position")
    public void testGetBookAtPosition(){
        library.addBook("El Quijote");
        library.addBook("El Señor de los Anillos");
        library.addBook("Don Juan Tenorio");
        assertEquals("El Quijote", library.getBookAtPosition(1));
        assertEquals("El Señor de los Anillos", library.getBookAtPosition(2));
        assertEquals("Don Juan Tenorio", library.getBookAtPosition(0));
    }

    //    Asseguren que afegir un llibre modifica correctament la llista.

    @Test
    @DisplayName("Library is modified after adding books")
    public void testLibraryIsModifiedAfterAddingBooks() {
        library.addBook("El Quijote");
        library.addBook("El Señor de los Anillos");
        library.addBook("Don Juan Tenorio");
        assertEquals("El Quijote", library.getBookAtPosition(1));
        assertEquals("El Señor de los Anillos", library.getBookAtPosition(2));
        assertEquals("Don Juan Tenorio", library.getBookAtPosition(0));
    }

    //    Confirmen que eliminar un llibre disminueix la mida de la llista.
    @Test
    @DisplayName("Library size is as expected after removing books")
    public void testLibrarySizeAfterRemovingBooks() {
        library.addBook("El Quijote");
        library.addBook("El Señor de los Anillos");
        library.addBook("Don Juan Tenorio");
        library.removeBook("El Quijote");
        assertEquals(2, library.getBooks().size());
    }

    //    Verifiquen que la llista roman ordenada alfabèticament després d'afegir o eliminar un llibre.
    @Test
    @DisplayName("Library is sorted after adding books")
    public void testLibraryIsSortedAfterAddingBooks() {
        library.addBook("El Quijote");
        library.addBook("El Señor de los Anillos");
        library.addBook("Don Juan Tenorio");
        library.addBook("Cien años de soledad");
        assertEquals("Cien años de soledad", library.getBookAtPosition(0));
        library.removeBook("Cien años de soledad");
        assertEquals("Don Juan Tenorio", library.getBookAtPosition(0));
    }

}
