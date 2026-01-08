package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password
    public static String generateFeedback(String password) {
        if (!CriteriaChecker.metLength()) {
            System.out.println("Your password is too short");
        }
        if (!CriteriaChecker.metUpper()) {
            System.out.println("Your password needs at least one uppercase letter");
        }
        if (!CriteriaChecker.metLower()) {
            System.out.println("Your password needs at least one lowercase letter");
        }
        if (!CriteriaChecker.metNumber()) {
            System.out.println("Your password needs at least one number");
        }
        if (!CriteriaChecker.metSpecial()) {
            System.out.println("Your password needs at least one special character");
        }
        else
        {
            return ("Your password looks great!");
        }
        System.out.println("Thank you for using the strength checker :)");
        return ("Good luck with making your password changes!");
    }
}
