package com.skypro.testikurs3kalkulator.CalculatorService;

import com.skypro.testikurs3kalkulator.CalculatorController.ExeptionCalculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer plus(Integer a, Integer b) {
        chekToNull( a,b);
        return a + b;
    }

    public Integer minus(Integer a, Integer b) {
        chekToNull(a,b);
        return a - b;
    }

    public double division(int a, int b) {
        chekToNull(a,b);
        if (b == 0) {
            throw new ExeptionCalculator();
        }
        return (double) a / b;
    }

    public Integer multiplication(Integer a, Integer b) {
        chekToNull(a,b);
        return a * b;
    }
    public void chekToNull(Integer a,Integer b){
        if (a==null||b==null)
            throw new ExeptionCalculator("Не заданы параметры a или b");

    }

//    public Integer notEqualToNullA(Integer a) {
//        return a = 0;
//    }
//
//    public Integer notEqualToNullB(Integer b) {
//        return b = 0;
//    }
}


