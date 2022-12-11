package com.skypro.testikurs3kalkulator;

import com.skypro.testikurs3kalkulator.CalculatorService.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.apache.coyote.http11.Constants.a;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParametrizedTest {
    private final CalculatorService calculatorService = new CalculatorService();
    private static final int NUMBER_5 = 5;
    private static final int NUMBER_6 = 6;
    private static final int NUMBER_7 = 7;
    private static final int NUMBER_8 = 8;
    private static final int ZERO = 0;
//    private int a;
//    private int b;


    @ParameterizedTest
    @MethodSource("parametersForTests")
    public void plusParametrizedTest1(int a, int b) {
        int result = calculatorService.plus(a, b);
        assertEquals(a + b, result);
    }


    @ParameterizedTest
    @MethodSource("parametersForTests")
    public void minusParametrizedTest1(int a, int b) {
        int result = calculatorService.minus(a, b);
        assertEquals(a - b, result);
    }


    @ParameterizedTest
    @MethodSource("parametersForTests")
    public void divisionParametrizedTest1(int a, int b) {
        int result = (int) calculatorService.division(a, b);
        assertEquals(a / b, result);
    }


    @ParameterizedTest
    @MethodSource("parametersForTests")
    public void multiplicationParametrizedTest1(int a, int b) {
        int result = (int) calculatorService.multiplication(a, b);
        assertEquals(a * b, result);
    }

    public static Stream<Arguments> parametersForTests() {
        return Stream.of(

                Arguments.of(NUMBER_5, NUMBER_6),
                Arguments.of(NUMBER_5, ZERO),
                Arguments.of(NUMBER_8, NUMBER_5),
                Arguments.of(NUMBER_6, NUMBER_8),
                Arguments.of(NUMBER_8, ZERO),
                Arguments.of(NUMBER_7, NUMBER_6),
                Arguments.of(NUMBER_7, NUMBER_5),
                Arguments.of(NUMBER_7, ZERO));

    }
}
