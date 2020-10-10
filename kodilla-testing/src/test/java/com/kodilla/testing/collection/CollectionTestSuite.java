package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;


public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }
    @DisplayName("how the method behaves when the list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> newNumbers = new ArrayList<>();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(newNumbers);
        List<Integer> expected = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(expected, result);
    }

    @DisplayName("how the method behaves when the list takes numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        List<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(2);
        newNumbers.add(4);
        newNumbers.add(6);

        //When
        List<Integer> expected = oddNumbersExterminator.exterminate(numbers);
        List<Integer> result = oddNumbersExterminator.exterminate(newNumbers);

        //Then
        Assertions.assertEquals(expected, result);
    }
}
