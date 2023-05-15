package com.example.hw_junit.services;

import com.example.hw_junit.exceptions.MyIllegalArgumentException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new MyIllegalArgumentException("Делить на 0 нельзя!");
        }
        return num1 / num2;
    }

}
