package org.hillcrest.chapter6.password;

/**
 * Checks how many password criteria a given password meets
 * Then returns the number out of 5
 */

public class CriteriaChecker {

    //   final static String NUMBERS = ("0123456789");
    public static int score = 0;

    //utility class

    private static boolean lengthy;
    private static boolean hasUpper;
    private static boolean hasLower;
    private static boolean hasNumber;
    private static boolean hasSpecial;

    /**
     * Grades password criteria
     * @param password the entered password
     * @return the score of the password
     */
    public static int evaluateCriteria(String password) {
         lengthy = (password.length() >= 8);
         hasUpper = false;
         hasLower = false;
        hasNumber = false;
        hasSpecial = false;

        //       if (password.contains(NUMBERS)) {
        //           hasNumber = true;
        //       }
        for (int i = 0; i < password.length(); i++) {
            char character = (password.charAt(i));
            if (Character.isUpperCase(character)) {
                hasUpper = true;

            }
            character = (password.charAt(i));
            if (Character.isLowerCase(character)) {
                hasLower = true;

            }
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;

            }
            if ((!(Character.isDigit(password.charAt(i)))) && (!(Character.isLetter(password.charAt(i))))) {
                hasSpecial = true;

            }
        }
            if (lengthy) {
                score++;
            }
            if (hasUpper) {
                score++;
            }
            if (hasLower) {
                score++;
            }
            if (hasNumber) {
                score++;
            }
            if (hasSpecial) {
                score++;
            }

        return (score);
    }

    public static boolean metLength() {
        return lengthy;
    }
    public static boolean metUpper() {
        return hasUpper;
    }
    public static boolean metLower() {
        return hasLower;
    }
    public static boolean metNumber() {
        return hasNumber;
    }
    public static boolean metSpecial() {
        return hasSpecial;
    }



    /**
     * Gives a description based on score
     * @param score
     * @return A description for how strong the password is
     */
    public static String determineStrength(int score) {
        if (score >= 0 && score <=2) {
            return ("Weak Password");
        }
        else if (score == 3) {
            return ("Moderate Password");
        }
        else if (score > 3 && score <=5) {
            return ("Strong Password");
        }

        return "Invalid Score";
    }
}
