package level3;

public class Calculator {

    /**
     * Add two integers
     * @param a
     * @param b
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        if((a > 0 && b > 0 && a > Integer.MAX_VALUE - b) || (a < 0 && b < 0 && a < Integer.MIN_VALUE - b)) {
            throw new ArithmeticException("Integer overflow");
        }
        return a + b;
    }

    // Método para sumar decimales (double)

    /**
     * Add two doubles
     * @param a
     * @param b
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        if((a > 0 && b > 0 && a > Double.MAX_VALUE - b) || (a < 0 && b < 0 && a < -Double.MAX_VALUE - b)) {
            throw new ArithmeticException("Double overflow");
        }
        return a + b;
    }

    // Método para restar enteros


    public int subtract(int a, int b) {
        if((a > 0 && b < 0 && a > Integer.MAX_VALUE + b) || (a < 0 && b > 0 && a < Integer.MIN_VALUE + b)) {
            throw new ArithmeticException("Integer underflow");
        }
        return a - b;
    }

    // Método para restar decimales (double)
    public double subtract(double a, double b) {
        if((a > 0 && b < 0 && a > Double.MAX_VALUE + b) || (a < 0 && b > 0 && a < -Double.MAX_VALUE + b)) {
            throw new ArithmeticException("Double underflow");
        }
        return a - b;
    }

    // Método para multiplicar enteros
    public int multiply(int a, int b) {
        if((a > 0 && b > 0 && a > Integer.MAX_VALUE / b) || (a < 0 && b < 0 && a < Integer.MAX_VALUE / b)) {
            throw new ArithmeticException("Integer overflow");
        }
        return a * b;
    }

    // Método para multiplicar decimales (double)
    public double multiply(double a, double b) {
        if((a > 0 && b > 0 && a > Double.MAX_VALUE / b) || (a < 0 && b < 0 && a < Double.MAX_VALUE / b)) {
            throw new ArithmeticException("Double overflow");
        }
        return a * b;
    }

    // Método para dividir enteros
    public int divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Método para dividir decimales (double)
    public double divide(double a, double b) {
        if (b == 0) {
            if (a == 0) {
                return Double.NaN; // Return NaN for 0.0 / 0.0
            }
            return (a > 0) ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY; // Return Infinity for non-zero / 0
        }
        return a / b;
    }

}
