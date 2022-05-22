package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {

        //Given
        //When
        double addResult = calculator.add(2, 4.5);
        //Then
        assertEquals(addResult, 6.5);
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
        double divResult = calculator.div(5, 2);
        //Then
        assertEquals(divResult, 2.5);

    }

    @Test
    public void testDivByZero() {

        //Given
        //When
        //Then
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }

}
