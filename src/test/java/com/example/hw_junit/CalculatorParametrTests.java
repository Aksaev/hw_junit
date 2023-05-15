package com.example.hw_junit;

import com.example.hw_junit.exceptions.MyIllegalArgumentException;
import com.example.hw_junit.services.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorParametrTests {
    CalculatorService serviceCalculator = new CalculatorService();

    @ParameterizedTest
    @MethodSource("paramsPlusTest")
    public void plusTest(int num1, int num2, int result) {
        assertEquals(result, serviceCalculator.plus(num1, num2));
    }

    public static Stream<Arguments> paramsPlusTest() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(5, -5, 0),
                Arguments.of(-5, -5, -10)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsMinusTest")
    public void minusTest(int num1, int num2, int result) {
        assertEquals(result, serviceCalculator.minus(num1, num2));
    }

    public static Stream<Arguments> paramsMinusTest() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(5, -5, 10),
                Arguments.of(-5, -5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsMultiplyTest")
    public void multiplyTest(int num1, int num2, int result) {
        assertEquals(result, serviceCalculator.multiply(num1, num2));
    }

    public static Stream<Arguments> paramsMultiplyTest() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(5, -5, -25),
                Arguments.of(-5, -5, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsDivideTest")
    public void divideTest(int num1, int num2, int result) {
        assertEquals(result, serviceCalculator.divide(num1, num2));
    }

    public static Stream<Arguments> paramsDivideTest() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(5, -5, -1),
                Arguments.of(-5, -5, 1)
        );
    }

}
