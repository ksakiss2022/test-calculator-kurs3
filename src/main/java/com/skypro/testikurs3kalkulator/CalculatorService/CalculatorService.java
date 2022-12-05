package com.skypro.testikurs3kalkulator.CalculatorService;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {public Integer plus(Integer a, Integer b) {
    if (a == null || b == null) {
        throw new IllegalArgumentException("Не заданы параметры");
    }
    return a + b;

}

    public Integer minus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Не заданы параметры");
        }
        return a - b;

    }

    public double division(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Не заданы параметры");
        }
        if (b == 0) {
            throw new IllegalArgumentException("Ошибка, на ноль делить нельзя");
        }
        return (double) a / b;

    }

    public Integer multiplication(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Не заданы параметры");
        }
        return a * b;
    }

}


