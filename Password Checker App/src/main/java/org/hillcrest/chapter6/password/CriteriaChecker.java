package org.hillcrest.chapter6.password;

/**
 * Checks how many password criteria a given password meets
 * Then returns the number out of 5
 */
public class CriteriaChecker {

    //   final static String NUMBERS = ("0123456789");
    private static int score = 0;

    //utility class

    /**
     * Grades password criteria
     * @param password the entered password
     * @return the score of the password
     */
    public static int evaluateCriteria(String password) {
        boolean lengthy = (password.length() >= 8);
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        //       if (password.contains(NUMBERS)) {
        //           hasNumber = true;
        //       }
        if (lengthy) {
            score++;
        }
        for (int i = 0; i < password.length(); i++) {
            char character = (password.charAt(i));
            if (Character.isUpperCase(character)) {
                hasUpper = true;
                score++;
            }
            character = (password.charAt(i));
            if (Character.isLowerCase(character)) {
                hasLower = true;
                score++;
            }
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
                score++;
            }
            if ((!(Character.isDigit(password.charAt(i)))) && (!(Character.isLetter(password.charAt(i))))) {
                hasSpecial = true;
                score++;
            }

        }
        return (score);
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
