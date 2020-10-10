package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> newNumbers = new ArrayList<>();
        for (Integer numb : numbers) {
            if (numb % 2 == 0) {
                newNumbers.add(numb);
            }
        }
        return newNumbers;
    }
}


