package com.sample.calculator.service;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testResultFromExpressionEvaluatorForFirstType(){
        Calculator calculator =
                new Calculator();
        Assert.assertEquals(8,
                calculator.calculate("2+3+3"),
                0.0);
    }
    @Test
    public void testResultFromExpressionEvaluatorForSecondType(){
        Calculator calculator =
                new Calculator();
        Assert.assertEquals(2,
                calculator.calculate("2+3-3"),
                0.0);
    }
    @Test
    public void testResultFromExpressionEvaluatorForThirdType(){
        Calculator calculator =
                new Calculator();
        Assert.assertEquals(-0.5,
                calculator.calculate("5 / 2 - 3"),
                0.0);
    }

    @Test
    public void testResultFromExpressionEvaluatorForFourthType(){
        Calculator calculator =
                new Calculator();
        Assert.assertEquals(8.2,
                calculator.calculate("5.2 + 3.0"),
                0.5);
    }
}
