package com.sample.calculator.operator;

import org.junit.Assert;
import org.junit.Test;

public class OperatorTest {
    @Test
    public void testResultForCorrectOperatorValueForAddition(){
        Operator operator = new Operator('+');
        Assert.assertEquals('+', operator.getType());
        Assert.assertEquals(1, operator.getPrecedence());
    }
    @Test
    public void testResultForCorrectOperatorValueForSubtraction(){
        Operator operator = new Operator('-');
        Assert.assertEquals('-', operator.getType());
        Assert.assertEquals(1, operator.getPrecedence());
    }
    @Test
    public void testResultForCorrectOperatorValueForDivision(){
        Operator operator = new Operator('/');
        Assert.assertEquals('/', operator.getType());
        Assert.assertEquals(2, operator.getPrecedence());
    }
    @Test
    public void testResultForCorrectOperatorValueForMultiplication(){
        Operator operator = new Operator('*');
        Assert.assertEquals('*', operator.getType());
        Assert.assertEquals(2, operator.getPrecedence());
    }
    @Test
    public void testResultForCorrectOperatorValueForOpeningBrace(){
        Operator operator = new Operator('(');
        Assert.assertEquals('(', operator.getType());
        Assert.assertEquals(0, operator.getPrecedence());
    }
    @Test
    public void testResultForCorrectOperatorValueForClosingBrace(){
        Operator operator = new Operator(')');
        Assert.assertEquals(')', operator.getType());
        Assert.assertEquals(-1, operator.getPrecedence());
    }

    @Test
    public void testResultShouldPrecedenceOfAddAndMultiply(){
        Operator operator = new Operator('+');
        Operator operator1 = new Operator('*');
        Assert.assertTrue(operator.comparePrecedence(operator1)<0);
    }

    @Test
    public void testResultShouldPrecedenceOfMultiplyAndSub(){
        Operator operator = new Operator('*');
        Operator operator1 = new Operator('-');
        Assert.assertTrue(operator.comparePrecedence(operator1)>0);
    }

    @Test
    public void testResultShouldPrecedenceOfMultiplyAndOpeningBrace(){
        Operator operator = new Operator('*');
        Operator operator1 = new Operator(')');
        Assert.assertTrue(operator.comparePrecedence(operator1)>0);
    }

    @Test
    public void testResultShouldPrecedenceOfOpeningBraceAndMultiply(){
        Operator operator = new Operator(')');
        Operator operator1 = new Operator('*');
        Assert.assertTrue(operator.comparePrecedence(operator1)<0);
    }
}
