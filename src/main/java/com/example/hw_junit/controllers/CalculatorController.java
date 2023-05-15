package com.example.hw_junit.controllers;

import com.example.hw_junit.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plusCalculator(@RequestParam("num1") Integer num1,
                                 @RequestParam("num2") Integer num2) {
        return String.format("%d + %d = %d", num1, num2, calculatorService.plus(num1, num2));
    }

    @GetMapping("/minus")
    public String minusCalculator(@RequestParam("num1") Integer num1,
                                  @RequestParam("num2") Integer num2) {
        return String.format("%d - %d = %d", num1, num2, calculatorService.minus(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiplyCalculator(@RequestParam("num1") Integer num1,
                                     @RequestParam("num2") Integer num2) {
        return String.format("%d * %d = %d", num1, num2, calculatorService.multiply(num1, num2));
    }

    @GetMapping("/divide")
    public String divideCalculator(@RequestParam("num1") Integer num1,
                                   @RequestParam("num2") Integer num2) {
        return String.format("%d / %d = %d", num1, num2, calculatorService.divide(num1, num2));
    }

}
