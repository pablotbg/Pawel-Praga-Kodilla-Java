package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        //7.1 Lambda expression - Stream
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("How are You", (str) -> str.toUpperCase());
        poemBeautifier.beautify("main name is anaa avans", (str)
                -> str.replaceAll("a", "A"));
        poemBeautifier.beautify("Hello, nice to meet you.", (str)
                -> "ABC " + str + " ABC");
        poemBeautifier.beautify("I'm ready to party", (str)
                -> str.concat(" -;)"));
    }
}
