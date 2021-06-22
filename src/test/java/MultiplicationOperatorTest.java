import operator.MultiplicationOperator;
import operator.Operator;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationOperatorTest {
    @Test
    public void testMultiplicationOperatorReturnsProperResponse(){
        Operator multiplicationOperator = new MultiplicationOperator();
        float number1 = (float) 10;
        float number2 = (float) 11;
        float expected = (float) 110;
        Assert.assertEquals(expected,multiplicationOperator.operate(number1, number2), 0.0);
    }
}
