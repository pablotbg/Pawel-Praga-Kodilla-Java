package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuit {

    @Test
    void probablyException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        Assertions.assertAll(
        () -> Assertions.assertThrows(Exception.class,
                () -> secondChallenge.probablyIWillThrowException(0.75, 1.75)),
        () -> Assertions.assertThrows(Exception.class,
                () -> secondChallenge.probablyIWillThrowException(2.25, 1.25)),
        () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.25))
        );
    }
}
