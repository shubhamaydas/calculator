import org.junit.Assert;
import org.junit.Test;

public class ExpressionEvaluatorTest {
    @Test
    public void testResultFromExpressionEvaluatorForFirstType(){
        ExpressionEvaluator expressionEvaluator =
                new ExpressionEvaluator();
        Assert.assertEquals(8,
                expressionEvaluator.evaluate("2+3+3"),
                0.0);
    }
    @Test
    public void testResultFromExpressionEvaluatorForSecondType(){
        ExpressionEvaluator expressionEvaluator =
                new ExpressionEvaluator();
        Assert.assertEquals(2,
                expressionEvaluator.evaluate("2+3-3"),
                0.0);
    }
    @Test
    public void testResultFromExpressionEvaluatorForThirdType(){
        ExpressionEvaluator expressionEvaluator =
                new ExpressionEvaluator();
        Assert.assertEquals(-0.5,
                expressionEvaluator.evaluate("5 / 2 - 3"),
                0.0);
    }
}
