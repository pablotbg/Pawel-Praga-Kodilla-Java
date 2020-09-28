package com.kodilla;

import java.util.Scanner;

class Calculator {
        int numberA;
        int numberB;

        public Calculator() {
            this.numberA = numberA;
            this.numberB = numberB;
        }

        public int getNumberA() {
            return numberA;
        }

        public int getNumberB() {
            return numberB;
        }

        public int additionAToB(int numberA, int numberB) {
            return numberA + numberB;
        }
        public int subtractionAFromB(int numberA, int numberB) {
            return numberA - numberB;
        }
}

class Application {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("The result of adding the numbers A and B: " + calculator.additionAToB(12, 3));
    System.out.println("The result of subtraction the numbers A and B: " + calculator.subtractionAFromB(15, 7));
    }
}
