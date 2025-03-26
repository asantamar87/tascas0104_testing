package level1;

public class OutOfBoundsException {

    public void throwIndexOutOfBoundsException(int [] array, int index) {
        if(index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }
}
