package com.skypro.testikurs3kalkulator.CalculatorController;

import com.skypro.testikurs3kalkulator.CalculatorService.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService=new CalculatorService();
    @GetMapping ("/plus")
    public Integer plus(@RequestParam("number_1")Integer a, @RequestParam("number_2") Integer b){
        return this.calculatorService.plus(a, b);
    }
    @GetMapping ("/minus")
    public Integer minus(@RequestParam("number_1")Integer a, @RequestParam("number_2") Integer b){
        return this.calculatorService.minus(a, b);
    }

    @GetMapping ("/multiplication")
    public Integer multiplication(@RequestParam("number_1")Integer a, @RequestParam("number_2") Integer b){
        return this.calculatorService.multiplication(a, b);
    }

    @GetMapping ("/division")
    public double division(@RequestParam("number_1")Integer a, @RequestParam("number_2") Integer b){
        return this.calculatorService.division(a, b);
    }

}
