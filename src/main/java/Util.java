public class Util {
    private Util(){

    }
    public static boolean hasPrecedence(
            char op1, char op2)
    {
        if (op2 == Constants.OPENING_BRACES || op2 == Constants.CLOSING_BRACES )
            return false;
        if ((op1 == Constants.MULTIPLY || op1 == Constants.DIVIDE) &&
                (op2 == Constants.ADD || op2 == Constants.SUBTRACT))
            return false;
        else
            return true;
    }
}
