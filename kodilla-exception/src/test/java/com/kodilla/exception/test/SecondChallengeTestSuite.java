package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1.0, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(2, 1.49)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(1.99, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(2, 1.5))
        );
    }
}
