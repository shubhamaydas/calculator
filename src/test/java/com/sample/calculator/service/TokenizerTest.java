package com.sample.calculator.service;

import com.sample.calculator.operator.Operand;
import com.sample.calculator.operator.Operator;
import com.sample.calculator.operator.Term;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TokenizerTest {

    @Test
    public void tokenizerTestToVerifyAllTokens(){
        Tokenizer tokenizer = new Tokenizer();
        ArrayList<Term> actual = tokenizer.getArrayListOfTokens("1+2+3");
        Operand firstTerm = (Operand) actual.get(0);
        Operator secondTerm = (Operator) actual.get(1);
        Operand thirdTerm = (Operand) actual.get(2);
        Operator fourthTerm = (Operator) actual.get(3);
        Operand fifthTerm = (Operand) actual.get(4);

        Assert.assertEquals(firstTerm.getValue(),1, 0);
        Assert.assertEquals(secondTerm.getType(),'+');
        Assert.assertEquals(thirdTerm.getValue(),2, 0);
        Assert.assertEquals(fourthTerm.getType(),'+');
        Assert.assertEquals(fifthTerm.getValue(),3, 0);
    }

    @Test
    public void tokenizerTestToVerifyAllTokensWithBraces(){
        Tokenizer tokenizer = new Tokenizer();
        ArrayList<Term> actual = tokenizer.getArrayListOfTokens("(1+2-3)");
        Operator firstTerm = (Operator) actual.get(0);
        Operand secondTerm = (Operand) actual.get(1);
        Operator thirdTerm = (Operator) actual.get(2);
        Operand fourthTerm = (Operand) actual.get(3);
        Operator fifthTerm = (Operator) actual.get(4);
        Operand sixthTerm = (Operand) actual.get(5);
        Operator seventhTerm = (Operator) actual.get(6);

        Assert.assertEquals(firstTerm.getType(),'(');
        Assert.assertEquals(secondTerm.getValue(),1, 0);
        Assert.assertEquals(thirdTerm.getType(),'+');
        Assert.assertEquals(fourthTerm.getValue(),2, 0);
        Assert.assertEquals(fifthTerm.getType(),'-');
        Assert.assertEquals(sixthTerm.getValue(),3, 0);
        Assert.assertEquals(seventhTerm.getType(),')');
    }
}
