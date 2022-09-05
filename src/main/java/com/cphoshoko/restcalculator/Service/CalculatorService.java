package com.cphoshoko.restcalculator.Service;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b) throws ArithmeticException {
            return Math.round(a / b);
    }

}
