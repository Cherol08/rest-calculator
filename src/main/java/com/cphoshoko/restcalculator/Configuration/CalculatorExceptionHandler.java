package com.cphoshoko.restcalculator.Configuration;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CalculatorExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    protected ResponseEntity<Object> handleZeroDivisionException() {
        return  ResponseEntity.internalServerError().body("You cannot divide by zero");
    }


    @ExceptionHandler({TypeMismatchException.class, MissingPathVariableException.class})
    public final ResponseEntity<Object> handleAllExceptions() {
        return  ResponseEntity.internalServerError()
                .body("An error occurred: Make sure to provide two valid numeric values for a calculation");
    }


}