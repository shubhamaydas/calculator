import operator.AdditionOperator;
import operator.Operator;
import org.junit.Assert;
import org.junit.Test;


public class AdditionalOperatorTest {
    @Test
    public void testAdditionalOperatorReturnsProperResponse(){
        Operator additionOperator = new AdditionOperator();
        float number1 = (float) 10.3;
        float number2 = (float) 11;
        float expected = (float) 21.3;
        Assert.assertEquals(expected,additionOperator.operate(number1, number2), 0.0);
    }
}
