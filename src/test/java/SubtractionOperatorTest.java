import operator.Operator;
import operator.SubtractionOperator;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionOperatorTest {
    @Test
    public void testSubtractionOperatorReturnsProperResponse(){
        Operator subtractionOperator = new SubtractionOperator();
        float number1 = (float) 10.3;
        float number2 = (float) 1;
        float expected = (float) 9.3;
        Assert.assertEquals(expected,subtractionOperator.operate(number1, number2), 0.0);
    }
}
