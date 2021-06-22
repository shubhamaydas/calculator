import com.sample.calculator.EvaluateExpression;
import org.junit.Assert;
import org.junit.Test;

public class EvaluateExpressionTest {
    @Test
    public void testFirstExpression(){
        EvaluateExpression evaluateExpression = new EvaluateExpression();
        Assert.assertEquals(6.0 , evaluateExpression.getResult("(1+ 2 + 3)"), 0);
    }

    @Test
    public void testSecondExpression(){
        EvaluateExpression evaluateExpression = new EvaluateExpression();
        float result = evaluateExpression.getResult("(3+ (2 + 3) * 1)");
        Assert.assertEquals(8.0 , result, 0);
    }

    @Test
    public void testThirdExpression(){
        EvaluateExpression evaluateExpression = new EvaluateExpression();
        float result = evaluateExpression.getResult("3+ 2 + 3 * 1");
        Assert.assertEquals(8.0 , result, 0);
    }

    @Test
    public void testFouthExpression(){
        EvaluateExpression evaluateExpression = new EvaluateExpression();
        float result = evaluateExpression.getResult("(1+2+(3+2.2) * (1 + 3) + 1)");
        Assert.assertEquals(24.8 , result, 0.2);
        Assert.assertEquals(14.0 , evaluateExpression.getResult("(1+2+5.0 * 2.0 + 1)"), 0);
    }

}
