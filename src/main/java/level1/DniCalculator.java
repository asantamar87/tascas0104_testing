package level1;

public class DniCalculator {
    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static char calculateLetter(int dniNumber) {
        return LETTERS.charAt(dniNumber % 23);
    }

}
