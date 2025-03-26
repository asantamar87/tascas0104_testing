package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayToolTest {

    @Test
    public void testArrayIndexOutOfBounds() {
        ArrayTool tool = new ArrayTool();
        int[] array = {1, 2, 3, 4, 5};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tool.throwIndexOutOfBoundsException(array, -1);
        });
    }
}


