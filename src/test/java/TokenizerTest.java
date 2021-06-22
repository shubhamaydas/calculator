import org.junit.Assert;
import org.junit.Test;
import service.Tokenizer;

public class TokenizerTest {
    @Test
    public void testTokenizerFirstString(){
        Tokenizer tokenizer = new Tokenizer();
        char[] remainingExpression = "1+2+3+4".toCharArray();
        Assert.assertEquals("1" , tokenizer.getNextFloatNumber(remainingExpression, 0));
    }
    @Test
    public void testTokenizerSecondString(){
        Tokenizer tokenizer = new Tokenizer();
        char[] remainingExpression = "1+2111+3+4".toCharArray();
        Assert.assertEquals("2111" , tokenizer.getNextFloatNumber(remainingExpression, 2));
    }

    @Test
    public void testTokenizerPlus(){
        Tokenizer tokenizer = new Tokenizer();
        char[] remainingExpression = "+-/*".toCharArray();
        Assert.assertEquals(2, tokenizer.getNextOperator(remainingExpression, 0).getPrecedence());
        Assert.assertEquals(2 , tokenizer.getNextOperator(remainingExpression, 1).getPrecedence());
        Assert.assertEquals(1 , tokenizer.getNextOperator(remainingExpression, 2).getPrecedence());
        Assert.assertEquals(1 , tokenizer.getNextOperator(remainingExpression, 3).getPrecedence());
    }
}
