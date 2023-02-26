package com.employees.employeemanagement.exceptions;


import org.springframework.http.HttpStatus;

public class EmployeeApiException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public EmployeeApiException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public EmployeeApiException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
