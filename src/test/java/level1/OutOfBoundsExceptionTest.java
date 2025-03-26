package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OutOfBoundsExceptionTest {

    @Test
    public void testIndexOutOfBoundsException() {

        OutOfBoundsException outOfBoundsException = new OutOfBoundsException();

        int [] array = {1, 2, 3, 4, 5};

        Exception exception =assertThrows(ArrayIndexOutOfBoundsException.class, () -> outOfBoundsException.throwIndexOutOfBoundsException(array, 5));

        String actual = exception.getMessage();
        String esperada = "Index out of bounds";

        assertEquals(esperada, actual);

    }
}


