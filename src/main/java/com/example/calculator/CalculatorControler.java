package com.example.calculator;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorControler {

    @RequestMapping("/sum")
    public int sum(
          @RequestParam int a,
          @RequestParam int b){
        return a+b;
    }
    @RequestMapping("/mult")
    public int mult(
          @RequestParam int a,
          @RequestParam int b){
        return a*b;
    }
    @RequestMapping("/minus")
    public int minus(
          @RequestParam int a,
          @RequestParam int b){
        return a-b;
    }
    @RequestMapping("/divided")
    public int divided(
          @RequestParam int a,
          @RequestParam int b){
        return a/b;
    }
    @RequestMapping("/potent")
    public double potent(
          @RequestParam double a,
          @RequestParam double power){

        return Math.pow(a, power);
    }
    @RequestMapping("/root")
    public double squareRoot(
          @RequestParam double a){

        return Math.pow(a, 0.5);
    }
 @RequestMapping("/absolut")
    public double absolut(
          @RequestParam double a){

        return Math.abs(a);
    }


}
