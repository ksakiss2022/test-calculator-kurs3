package com.skypro.testikurs3kalkulator;

import com.skypro.testikurs3kalkulator.CalculatorService.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorParametrizedTest {
    private CalculatorService calculatorService;
    private final Integer NUMBER_5 = 5;
    private final Integer NUMBER_6 = 6;
    private final Integer NUMBER_7 = 7;
    private final Integer NUMBER_8 = 8;


    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void plusParametrizedTest1(Integer NUMBER_8, Integer NUMBER_5) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.plus(NUMBER_5, NUMBER_8), NUMBER_5 + NUMBER_8);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void plusParametrizedTest2(Integer NUMBER_6, Integer NUMBER_7) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.plus(NUMBER_6, NUMBER_7), NUMBER_6 + NUMBER_7);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void plusParametrizedTest3(Integer NUMBER_6, Integer NUMBER_8) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.plus(NUMBER_6, NUMBER_8), NUMBER_6 + NUMBER_8);
    }
    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void plusParametrizedTest4(Integer NUMBER_5, Integer NUMBER_7) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.plus(NUMBER_5, NUMBER_7), NUMBER_5 + NUMBER_7);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void minusParametrizedTest1(Integer NUMBER_8, Integer NUMBER_5) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.minus(NUMBER_5, NUMBER_8), NUMBER_5 - NUMBER_8);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void minusParametrizedTest2(Integer NUMBER_6, Integer NUMBER_7) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.minus(NUMBER_6, NUMBER_7), NUMBER_6 - NUMBER_7);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void minusParametrizedTest3(Integer NUMBER_6, Integer NUMBER_8) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.minus(NUMBER_6, NUMBER_8), NUMBER_6 - NUMBER_8);
    }
    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void minusParametrizedTest4(Integer NUMBER_5, Integer NUMBER_7) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.minus(NUMBER_5, NUMBER_7), NUMBER_5 - NUMBER_7);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void divisionParametrizedTest1(Integer NUMBER_8, Integer NUMBER_5) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.division(NUMBER_5, NUMBER_8), NUMBER_5 / NUMBER_8);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void divisionParametrizedTest2(Integer NUMBER_6, Integer NUMBER_7) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.division(NUMBER_6, NUMBER_7), NUMBER_6 / NUMBER_7);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void divisionParametrizedTest3(Integer NUMBER_6, Integer NUMBER_8) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.division(NUMBER_6, NUMBER_8), NUMBER_6 / NUMBER_8);
    }
    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void divisionParametrizedTest4(Integer NUMBER_5, Integer NUMBER_7) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.division(NUMBER_5, NUMBER_7), NUMBER_5 / NUMBER_7);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void multiplicationParametrizedTest1(Integer NUMBER_8, Integer NUMBER_5) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.multiplication(NUMBER_5, NUMBER_8), NUMBER_5 * NUMBER_8);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void multiplicationParametrizedTest2(Integer NUMBER_6, Integer NUMBER_7) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.multiplication(NUMBER_6, NUMBER_7), NUMBER_6 * NUMBER_7);
    }

    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void multiplicationParametrizedTest3(Integer NUMBER_6, Integer NUMBER_8) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.multiplication(NUMBER_6, NUMBER_8), NUMBER_6 * NUMBER_8);
    }
    @ParameterizedTest
    @MethodSource("parametrsTests")
    public void multiplicationParametrizedTest4(Integer NUMBER_5, Integer NUMBER_7) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.multiplication(NUMBER_5, NUMBER_7), NUMBER_5 * NUMBER_7);
    }
}
