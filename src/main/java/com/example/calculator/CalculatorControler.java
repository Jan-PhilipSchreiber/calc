package com.example.calculator;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CalculatorControler {

    Calculator calculator = new Calculator();

    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b) {
        return calculator.sum(a, b);

    }

    @RequestMapping("/mult")
    public int mult(
            @RequestParam int a,
            @RequestParam int b) {
        return calculator.mult(a, b);
    }

    @RequestMapping("/minus")
    public int minus(
            @RequestParam int a,
            @RequestParam int b) {
        return calculator.minus(a, b);
    }

    @RequestMapping("/divided")
    public double divided(
            @RequestParam double a,
            @RequestParam double b) {
        return calculator.divided(a, b);
    }

    @RequestMapping("/potent")
    public double potent(
            @RequestParam double a,
            @RequestParam double power) {

        return calculator.potent(a, power);
    }

    @RequestMapping("/root")
    public double squareRoot(
            @RequestParam double a) {

        return calculator.squareRoot(a);
    }

    @RequestMapping("/absolut")
    public double absolut(
            @RequestParam double a) {

        return calculator.absolut(a);
    }


}
