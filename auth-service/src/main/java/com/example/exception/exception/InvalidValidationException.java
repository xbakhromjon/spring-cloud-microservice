package com.example.exception.exception;

public class InvalidValidationException extends RuntimeException {
    public InvalidValidationException() {
        super();
    }

    public InvalidValidationException(String message) {
        super(message);
    }
}
