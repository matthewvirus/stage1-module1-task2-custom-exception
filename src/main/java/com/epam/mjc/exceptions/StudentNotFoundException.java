package com.epam.mjc.exceptions;

public class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(String message) {
        super(message);
    }
}