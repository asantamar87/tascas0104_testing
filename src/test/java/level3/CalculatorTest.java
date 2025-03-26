package level3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {


    @Test
    @DisplayName("Add test")
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Substract test")
    public void testSubstract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    @DisplayName("Multiply test")
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Divide test")
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10, 2));
    }


    @Test
    void testDivideZeroByZero() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(0.0, 0.0);
        assertTrue(Double.isNaN(result), "0.0 / 0.0 should return NaN");
    }

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(5.0, 0.0);
        assertTrue(Double.isInfinite(result), "Dividing by zero should return Infinity");
    }


    @Test
    void testAddOverflow() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.add(Integer.MAX_VALUE, 1); // Esto debe lanzar una excepción de desbordamiento
        }, "Adding two numbers that exceed Integer.MAX_VALUE should throw ArithmeticException");
    }

    @Test
    void testSubtractUnderflow() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.subtract(Integer.MIN_VALUE, 1); // Esto debe lanzar una excepción de subdesbordamiento
        }, "Subtracting two numbers that exceed Integer.MIN_VALUE should throw ArithmeticException");
    }

    @Test
    void testMultiplyOverflow() {
        Calculator calculadora = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.multiply(Integer.MAX_VALUE, 2); // Esto debe lanzar una excepción de desbordamiento
        }, "Multiplying two numbers that exceed Integer.MAX_VALUE should throw ArithmeticException");
    }



}
