package level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class DniCalculatorTest {

    @Test
    @DisplayName("DNI letter calculation")
    public void testDniLetterCalculation() {
        assertEquals('B', DniCalculator.calculateLetter(21751088));
        assertEquals('Z', DniCalculator.calculateLetter(12345678));
    }








}
