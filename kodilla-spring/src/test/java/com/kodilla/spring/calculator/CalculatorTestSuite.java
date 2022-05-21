package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {

        //Given
        //When
        calculator.add(2,4.5);
        //Then
    }

    @Test
    public void testSub() {

        //Given
        //When
        double subtractResult = calculator.sub(10, 5.1);
        //Then
        assertEquals(subtractResult, 4.9);
    }

    @Test
    public void testMul() {

        //Given
        //When
        double multiplyResult = calculator.mul(5.5, 5.5);
        //Then
        assertEquals(multiplyResult, 30.25);
    }

    @Test
    public void testDiv() {

        //Given
        //When
        calculator.div(5, 0);
        //Then

    }

}
