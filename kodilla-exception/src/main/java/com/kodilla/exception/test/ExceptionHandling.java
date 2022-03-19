package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String example = secondChallenge.probablyWillThrowException(1, 4);
            System.out.println(example);
        } catch (Exception e) {
            System.out.println("Excpetion");
        } finally {
            System.out.println("***THROW AND THROWS TASK***");
        }
    }
}
