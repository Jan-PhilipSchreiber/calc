package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    void sumTest() {
        //Arange
        int a = 2;
        int b = 5;

        int expectedResult = 7;
        //Act
        int result = calculator.sum(a, b);
        //Assert
        //expected resut=result
        assertEquals(expectedResult, result);
    }


    @Test
    void multTest() {
        int a = 2;
        int b = 5;
        int expectedResult = 10;
        int result = calculator.mult(a, b);
        assertEquals(expectedResult, result);

    }

    @Test
    void minusTest() {
        int a = 5;
        int b = 2;
        int expectedResult = 3;
        int result = calculator.minus(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    void dividedTest() {
        double a = 2;
        double b = 5;
        double expectedResult = 0.4;
        double result = calculator.divided(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    void potentTest() {
        double a = 2;
        double b = 5;
        double expectedResult = 32;
        double result = calculator.potent(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    void squareRootTest() {
        double a = 4;
        double result = calculator.squareRoot(a);
        double expectedResult = 2;

        assertEquals(expectedResult, result);
    }

    @Test
    void absolutTest() {
        double a = 2;
        double expectedResult = 2;
        double result = calculator.absolut(a);

        assertEquals(expectedResult, result);
    }
}