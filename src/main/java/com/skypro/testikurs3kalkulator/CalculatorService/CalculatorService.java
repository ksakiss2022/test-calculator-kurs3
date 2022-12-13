package com.skypro.testikurs3kalkulator.CalculatorService;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer plus(Integer a, Integer b) {

        return a + b;
    }

    public Integer minus(Integer a, Integer b) {
        return a - b;
    }

    public double division(double a, int b) {
        return (double) a / b;
    }

    public Integer multiplication(Integer a, Integer b) {
        return a * b;
    }

    public Integer notEqualToNullA(Integer a) {
        return a = 0;
    }

    public Integer notEqualToNullB(Integer b) {
        return b = 0;
    }
}


