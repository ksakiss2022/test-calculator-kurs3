package com.skypro.testikurs3kalkulator.CalculatorService;

import org.springframework.stereotype.Service;

import static org.apache.coyote.http11.Constants.a;

@Service
public class CalculatorService {
    public Integer plus(Integer a, Integer b) {

        return a + b;
    }

    public Integer minus(Integer a, Integer b) {
        return a - b;
    }

    public double division(int a, int b) {
        return (double) a / b;
    }

    public Integer multiplication(Integer a, Integer b) {
        return a * b;
    }

    public Integer notEqualToNullA(Integer a) {
        if (a == null) {
            throw new IllegalArgumentException("Не заданы параметры -a-");
        }
        return a = 0;
    }

    public Integer notEqualToNulBA(Integer b) {
        if (b == null) {
            throw new IllegalArgumentException("Не заданы параметры -b-");
        }
        return b = 0;
    }
}


