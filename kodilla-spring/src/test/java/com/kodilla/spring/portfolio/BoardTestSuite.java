package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board borad = context.getBean(Board.class);

        //When
        borad.getToDoList().addTasks("Go to school.");
        borad.getInProgressList().addTasks("Reading book.");
        borad.getDoneList().addTasks("Done math homework.");

        //Then
        assertEquals("Go to school.", borad.getToDoList().getTasks().get(0));
        assertEquals("Reading book.", borad.getInProgressList().getTasks().get(0));
        assertEquals("Done math homework.", borad.getDoneList().getTasks().get(0));
    }
}
