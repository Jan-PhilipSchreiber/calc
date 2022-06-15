package com.example.calculator;

import org.springframework.web.bind.annotation.RequestParam;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mult(
            int a,
            int b) {
        return a * b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public double divided(double a, double b) {
        return a / b;
    }

    public double potent(double a, double power) {

        return Math.pow(a, power);
    }

    public double squareRoot(double a) {
        return Math.pow(a, 0.5);
    }

    public double absolut(double a) {
        return Math.abs(a);
    }

}
