import org.junit.Assert;
import org.junit.Test;

public class UtilTest {

    @Test
    public void testWhoHasPrecedence(){
        Assert.assertEquals(true, Util.hasPrecedence(Constants.DIVIDE, Constants.MULTIPLY));
    }

    @Test
    public void testWhoHasPrecedenceRe(){
        //Assert.assertEquals(false, Util.hasPrecedence(Constants.DIVIDE, Constants.MULTIPLY));
    }
}
