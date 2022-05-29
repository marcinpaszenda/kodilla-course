package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {

        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Shopping in city center", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {

        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Finish the picture", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {

        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("A trip", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }



}
