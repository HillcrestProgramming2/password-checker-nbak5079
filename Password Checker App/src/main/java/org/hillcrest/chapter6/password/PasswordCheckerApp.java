package org.hillcrest.chapter6.password;

import java.util.Scanner;



public class PasswordCheckerApp {
    //main method goes here
    //prompt user for password
    //Check strength
    //Provide user feedback based on the strength
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter your password: ");
       String password = in.nextLine();
       int score = CriteriaChecker.evaluateCriteria(password);
       String strength = CriteriaChecker.determineStrength(score);
       System.out.println("score: " + score);
       System.out.println(strength);
       String feedback = FeedbackGenerator.generateFeedback(password);
       System.out.println(feedback);


    }
}
