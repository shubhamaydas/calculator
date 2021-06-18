public class DivisionOperator implements Operator{
    @Override
    public float operate(Float operandOne, Float operandTwo) {
        if (operandTwo == 0)
            throw new
                    UnsupportedOperationException(
                    "Cannot divide by zero");

        return (float) operandOne/operandTwo;
    }
}
