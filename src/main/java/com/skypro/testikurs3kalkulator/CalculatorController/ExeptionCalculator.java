package com.skypro.testikurs3kalkulator.CalculatorController;

public class ExeptionCalculator extends IllegalArgumentException {
    public ExeptionCalculator() {
    }

    public ExeptionCalculator(String s) {
        super(s);
    }

    public ExeptionCalculator(String message, Throwable cause) {
        super(message, cause);
    }

    public ExeptionCalculator(Throwable cause) {
        super(cause);
    }
}
