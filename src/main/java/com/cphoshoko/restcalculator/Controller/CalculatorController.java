package com.cphoshoko.restcalculator.Controller;

import com.cphoshoko.restcalculator.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/sum")
    public Integer add(@RequestParam int a, @RequestParam int b){
        return  calculatorService.add(a,b);
    }

    @GetMapping("/subtraction")
    public int subtract(@RequestParam int a, @RequestParam int b)  {
        return calculatorService.subtract(a,b);

    }

    @GetMapping("/multiplication")
    public int multiply(@RequestParam int a, @RequestParam int b){
        return calculatorService.multiply(a,b);
    }

    @GetMapping("/division")
    public int divide(@RequestParam int a, @RequestParam int b){
        return calculatorService.divide(a,b);
    }

}
