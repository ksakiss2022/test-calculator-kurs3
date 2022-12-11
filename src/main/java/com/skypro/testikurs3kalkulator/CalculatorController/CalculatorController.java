package com.skypro.testikurs3kalkulator.CalculatorController;

import com.skypro.testikurs3kalkulator.CalculatorService.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();

    @GetMapping("/plus")
    public int plus(@RequestParam("number_1") int a, @RequestParam("number_2") int b) {
        return this.calculatorService.plus(a, b);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam("number_1") int a, @RequestParam("number_2") int b) {
        return this.calculatorService.minus(a, b);
    }

    @GetMapping("/multiplication")
    public int multiplication(@RequestParam("number_1") int a, @RequestParam("number_2") int b) {
        return this.calculatorService.multiplication(a, b);
    }

    @GetMapping("/division")
    public double division(@RequestParam("number_1") int a, @RequestParam("number_2") int b) {
        return this.calculatorService.division(a, b);
    }

}
