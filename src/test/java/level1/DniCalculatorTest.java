package level1;

import level3.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

public class DniCalculatorTest {



    @ParameterizedTest
    @CsvSource({
            "21751088, B",
            "12345678, Z",
            "00000000, T",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B"
    })
    void testCalcularLletra(int dniNumber, char expectedLletra) {
        assertEquals(expectedLletra, DniCalculator.calculateLetter(dniNumber));
    }


}
