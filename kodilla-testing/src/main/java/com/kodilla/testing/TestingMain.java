package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        System.out.println("\nTest - pierwszy test jednostkowy:\n");


        Calculator calculator = new Calculator(5, 3);
        int resultOne = calculator.getA() + calculator.getB();
        if (resultOne != calculator.add()) {
            System.out.println("Error!");
        } else {
            System.out.println("test OK. Result is: " + resultOne);
        }

        int resultTwo = calculator.getA() - calculator.getB();
        if (resultTwo == calculator.subtract()) {
            System.out.println("test OK. Result is: " + resultTwo);
        } else {
            System.out.println("Error!");
        }
    }
}
