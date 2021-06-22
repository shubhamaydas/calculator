package operator;

import operator.DivisionOperator;
import operator.Operator;
import org.junit.Assert;
import org.junit.Test;

public class DivisionOperatorTest {

    @Test
    public void testDivisionOperatorReturnsProperResponse(){
        Operator divisionOperator = new DivisionOperator();
        float number1 = (float) 10.2;
        float number2 = (float) 2;
        float expected = (float) 5.1;
        Assert.assertEquals(expected,divisionOperator.operate(number1, number2), 0.0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDivisionOperatorReturnsProperErrorWhenOperandTwoIsZero(){
        Operator divisionOperator = new DivisionOperator();
        float number1 = (float) 10.2;
        float number2 = (float) 0.0;
        float expected = (float) 5.1;
        divisionOperator.operate(number1, number2);
    }
}

