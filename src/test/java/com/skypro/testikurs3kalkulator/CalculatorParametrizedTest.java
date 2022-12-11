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
    private final CalculatorService out = new CalculatorService();
//    private final Integer NUMBER_5 = 5;
//    private final Integer NUMBER_6 = 6;
//    private final Integer NUMBER_7 = 7;
//    private final Integer NUMBER_8 = 8;

    @ParameterizedTest
    @MethodSource("parametersForTests")
    public void shouldGenerateCorrectMessages(Integer a, Integer b) {
        Integer result = out.plus(a, b);
        assertEquals(b, result);
    }
    public static Stream<Arguments> parametersForTests() {
        return Stream.of(

                Arguments.of(1, 3),
                Arguments.of(1, 2),
                Arguments.of(1, 4),
                Arguments.of(1, 5),
                Arguments.of(1, 6),
                Arguments.of(1, 7),
                Arguments.of(1, 8),
                Arguments.of(1, 9));
//    @ParameterizedTest
//    @MethodSource("parametersForTests")
//    public void plusParametrizedTest1(Integer NUMBER_5, Integer NUMBER_8) {
//        calculatorService = new CalculatorService();
//        Assertions.assertEquals(calculatorService.plus(NUMBER_5, NUMBER_8), NUMBER_5 + NUMBER_8);
//    }
//
//
//    @ParameterizedTest
//    @MethodSource("parametersForTests")
//    public void minusParametrizedTest1(Integer NUMBER_8, Integer NUMBER_5) {
//        calculatorService = new CalculatorService();
//        Assertions.assertEquals(calculatorService.minus(NUMBER_5, NUMBER_8), NUMBER_5 - NUMBER_8);
//    }
//
//
//    @ParameterizedTest
//    @MethodSource("parametersForTests")
//    public void divisionParametrizedTest1(Integer NUMBER_8, Integer NUMBER_4) {
//        calculatorService = new CalculatorService();
//        Assertions.assertEquals(calculatorService.division(NUMBER_8, NUMBER_4), NUMBER_8 / NUMBER_4);
//    }
//
//
//    @ParameterizedTest
//    @MethodSource("parametersForTests")
//    public void multiplicationParametrizedTest1(Integer NUMBER_8, Integer NUMBER_5) {
//        calculatorService = new CalculatorService();
//        Assertions.assertEquals(calculatorService.multiplication(NUMBER_5, NUMBER_8), NUMBER_5 * NUMBER_8);
//    }

    }
}
