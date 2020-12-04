package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addition = calculator.add(10, 2);
        double subtraction = calculator.sub(10, 2);
        double multiplication = calculator.mul(10, 2);
        double division = calculator.div(10, 2);

        //Then
        assertEquals(12, addition);
        assertEquals(8, subtraction);
        assertEquals(20, multiplication);
        assertEquals(5, division);
    }
}
