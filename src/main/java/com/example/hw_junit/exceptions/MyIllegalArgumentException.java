package com.example.hw_junit.exceptions;

public class MyIllegalArgumentException extends IllegalArgumentException {
    public MyIllegalArgumentException() {
        super();
    }

    public MyIllegalArgumentException(String message) {
        super(message);
    }
}
