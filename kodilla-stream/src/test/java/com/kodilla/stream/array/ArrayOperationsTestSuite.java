package com.kodilla.stream.array;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {2, 5, 6, 7, 9, 10, 12, 13, 15, 19, 21, 22, 26, 28, 36, 42, 43, 48, 49, 50};

        //When
        double expected = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(23.15, expected);
    }
}
