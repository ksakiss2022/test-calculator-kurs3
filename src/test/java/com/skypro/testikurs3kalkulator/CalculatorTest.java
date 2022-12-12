package com.skypro.testikurs3kalkulator;

import com.skypro.testikurs3kalkulator.CalculatorService.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Integer NUMBER_1 = 1;
    private final Integer NUMBER_2 = 2;
    private final Integer NUMBER_3 = 3;
    private final Integer NUMBER_4 = 4;


    private final CalculatorService calculatorService = new CalculatorService();

    @BeforeEach
    @Test
    public void checkingThePlus1() {
        Integer expected = calculatorService.plus
                (NUMBER_3, NUMBER_4);
        Integer actual = NUMBER_3 + NUMBER_4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePlus2() {
        Integer expected = calculatorService.plus
                (NUMBER_1, NUMBER_2);
        Integer actual = NUMBER_1 + NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePlus3() {
        Integer expected = calculatorService.plus
                (NUMBER_3, NUMBER_1);
        Integer actual = NUMBER_3 + NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePlus4() {
        Integer expected = calculatorService.plus
                (NUMBER_4, NUMBER_1);
        Integer actual = NUMBER_4 + NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMinus1() {
        Integer expected = calculatorService.minus
                (NUMBER_1, NUMBER_2);
        Integer actual = NUMBER_1 - NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMinus2() {
        Integer expected = calculatorService.minus
                (NUMBER_3, NUMBER_2);
        Integer actual = NUMBER_3 - NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMinus3() {
        Integer expected = calculatorService.minus
                (NUMBER_3, NUMBER_1);
        Integer actual = NUMBER_3 - NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMinus4() {
        Integer expected = calculatorService.minus
                (NUMBER_4, NUMBER_1);
        Integer actual = NUMBER_4 - NUMBER_1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMultiplication1() {
        Integer expected = calculatorService.multiplication
                (NUMBER_1, NUMBER_2);
        Integer actual = NUMBER_1 * NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMultiplication2() {
        Integer expected = calculatorService.multiplication
                (NUMBER_3, NUMBER_2);
        Integer actual = NUMBER_3 * NUMBER_2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMultiplication3() {
        Integer expected = calculatorService.multiplication
                (NUMBER_3, NUMBER_1);
        Integer actual = NUMBER_1 * NUMBER_3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheMmultiplication4() {
        Integer expected = calculatorService.multiplication
                (NUMBER_4, NUMBER_1);
        Integer actual = NUMBER_4 * NUMBER_1;

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
