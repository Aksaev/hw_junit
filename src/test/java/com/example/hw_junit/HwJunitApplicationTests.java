package com.example.hw_junit;

import com.example.hw_junit.exceptions.MyIllegalArgumentException;
import com.example.hw_junit.services.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HwJunitApplicationTests {

    CalculatorService serviceCalculator = new CalculatorService();

    @Test
    void plusPositiveNumbers() {
        int result = serviceCalculator.plus(5, 5);
        Assertions.assertEquals(10, result);
    }

    @Test
    void plusNegativeNumbers() {
        int result = serviceCalculator.plus(-5, -5);
        Assertions.assertEquals(-10, result);
    }

    @Test
    void minusPositiveNumbers() {
        int result = serviceCalculator.minus(5, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    void minusNegativeNumbers() {
        int result = serviceCalculator.minus(-5, -5);
        Assertions.assertEquals(0, result);
    }

    @Test
    void multiplyPositiveNumbers() {
        int result = serviceCalculator.multiply(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    void multiplyNegativeNumbers() {
        int result = serviceCalculator.multiply(-5, -5);
        Assertions.assertEquals(25, result);
    }

    @Test
    void multiplyPositiveNegativeNumbers() {
        int result = serviceCalculator.multiply(-5, 5);
        Assertions.assertEquals(-25, result);
    }

    @Test
    void dividePositiveNumbers() {
        int result = serviceCalculator.divide(5, 5);
        Assertions.assertEquals(1, result);
    }

    @Test
    void dividePositiveNegativeNumbers() {
        int result = serviceCalculator.divide(-5, 5);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void divideException() {
        Assertions.assertThrows(MyIllegalArgumentException.class, ()-> serviceCalculator.divide(5, 0));
    }

}
