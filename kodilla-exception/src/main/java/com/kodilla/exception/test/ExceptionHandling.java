package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.0, 1.25);
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println("Unacceptable. Correct x or y.");
        }
    }
}