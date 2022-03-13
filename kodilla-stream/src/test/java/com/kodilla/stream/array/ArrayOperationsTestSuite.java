package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int array[] = new int[10];
        array [0] = 5;
        array [1] = 10;
        array [2] = 15;
        array [3] = 20;
        array [4] = 25;
        array [5] = 30;
        array [6] = 35;
        array [7] = 40;
        array [8] = 45;
        array [9] = 50;

        //When
        double result = ArrayOperations.getAverage(array);

        //Then
        assertEquals(27.5, result);
    }
}
