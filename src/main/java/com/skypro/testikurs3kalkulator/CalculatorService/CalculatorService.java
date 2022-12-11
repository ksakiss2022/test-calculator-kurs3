package com.skypro.testikurs3kalkulator.CalculatorService;

import org.springframework.stereotype.Service;

import static org.apache.coyote.http11.Constants.a;

@Service
public class CalculatorService {
    public int plus(int a, int b) {

        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public double division(int a, int b) {
        return (double) a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

//    public Integer notEqualToNullA(Integer a) {
//        if (a == null) {
//            throw new IllegalArgumentException("Не заданы параметры -a-");
//        }
//        return a = 0;
//    }
//
//    public Integer notEqualToNulBA(Integer b) {
//        if (b == null) {
//            throw new IllegalArgumentException("Не заданы параметры -b-");
//        }
//        return b = 0;
//    }
}


