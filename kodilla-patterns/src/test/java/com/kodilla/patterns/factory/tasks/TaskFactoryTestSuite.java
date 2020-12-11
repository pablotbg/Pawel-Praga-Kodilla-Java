package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Than
        assertTrue(shopping.isTaskExecuted());
        assertEquals("Shopping list.", shopping.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();
        //Than
        assertTrue(painting.isTaskExecuted());
        assertEquals("Home painting.", painting.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //Than
        assertTrue(driving.isTaskExecuted());
        assertEquals("Business trip.", driving.getTaskName());
    }
}
