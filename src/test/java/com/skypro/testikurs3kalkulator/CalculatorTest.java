package com.skypro.testikurs3kalkulator;

import com.skypro.testikurs3kalkulator.CalculatorService.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final int NUMBER_1 = 1;
    private final int NUMBER_2 = 2;
    private final int NUMBER_3 = 3;
    private final int NUMBER_4 = 4;


    private final CalculatorService calculatorService = new CalculatorService();

    @BeforeEach
    @Test
    public void checkingThePlus1() {
        int expected = calculatorService.plus
                (NUMBER_3, NUMBER_4);
        int actual = NUMBER_3 + NUMBER_4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePlus2() {
        int expected = calculatorService.plus
                (NUMBER_1, NUMBER_2);
        int actual = NUMBER_1 + NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePlus3() {
        int expected = calculatorService.plus
                (NUMBER_3, NUMBER_1);
        int actual = NUMBER_3 + NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePlus4() {
        int expected = calculatorService.plus
                (NUMBER_4, NUMBER_1);
        int actual = NUMBER_4 + NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMinus1() {
        int expected = calculatorService.minus
                (NUMBER_1, NUMBER_2);
        int actual = NUMBER_1 - NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMinus2() {
        int expected = calculatorService.minus
                (NUMBER_3, NUMBER_2);
        int actual = NUMBER_3 - NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMinus3() {
        int expected = calculatorService.minus
                (NUMBER_3, NUMBER_1);
        int actual = NUMBER_3 - NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMinus4() {
        int expected = calculatorService.minus
                (NUMBER_4, NUMBER_1);
        int actual = NUMBER_4 - NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMultiplication1() {
        int expected = calculatorService.multiplication
                (NUMBER_1, NUMBER_2);
        int actual = NUMBER_1 * NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMultiplication2() {
        int expected = calculatorService.multiplication
                (NUMBER_3, NUMBER_2);
        int actual = NUMBER_3 * NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMultiplication3() {
        int expected = calculatorService.multiplication
                (NUMBER_3, NUMBER_1);
        int actual = NUMBER_1 * NUMBER_3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMmultiplication4() {
        int expected = calculatorService.multiplication
                (NUMBER_4, NUMBER_1);
        int actual = NUMBER_4 * NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheDivision1() {
        double expected = calculatorService.division
                (NUMBER_1, NUMBER_2);
        double actual = (double) NUMBER_1 / NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheDivision2() {
        double expected = calculatorService.division
                (NUMBER_3, NUMBER_2);
        double actual = (double) NUMBER_3 / NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheDivision3() {
        double expected = calculatorService.division
                (NUMBER_3, NUMBER_1);
        double actual = (double) NUMBER_3 / NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheDivision4() {
        double expected = calculatorService.division
                (NUMBER_4, NUMBER_1);
        double actual = (double) NUMBER_4 / NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }
}
