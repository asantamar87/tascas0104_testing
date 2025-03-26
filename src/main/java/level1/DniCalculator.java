package level1;

public class DniCalculator {
    public static char calculateLetter(int dniNumber) {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int charIndex = dniNumber % 23;
        return letters.charAt(charIndex);
    }

}
