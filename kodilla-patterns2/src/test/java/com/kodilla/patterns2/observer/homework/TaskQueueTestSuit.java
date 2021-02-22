package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuit {
    @Test
    void updateTaskTest() {
        //Given
        TaskQueue michaelTask = new TaskQueue("Michael");
        TaskQueue annaTask = new TaskQueue("Anna");
        TaskQueue alexTask = new TaskQueue("Alex");
        Mentor mentorJohn = new Mentor("John");
        Mentor mentorTed = new Mentor("Ted");
        michaelTask.registerObserver(mentorJohn);
        annaTask.registerObserver(mentorJohn);
        alexTask.registerObserver(mentorTed);

        //Then
        michaelTask.addTask("Java Lambda");
        michaelTask.addTask("Java Arrays");
        michaelTask.addTask("Java Methods");
        alexTask.addTask("Java Class Attributes");
        alexTask.addTask("Java Lambda");
        annaTask.addTask("Java Class Attributes");

        //Given
        assertEquals(4, mentorJohn.getUpdateCount());
        assertEquals(2, mentorTed.getUpdateCount());
    }
}
