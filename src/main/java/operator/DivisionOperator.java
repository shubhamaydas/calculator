package operator;

import operator.Operator;

public class DivisionOperator implements Operator {
    @Override
    public  int getPrecedence(){
        return 1;
    }

    @Override
    public float operate(Float operandOne, Float operandTwo) {
         if (operandTwo == 0)
            throw new
                    UnsupportedOperationException(
                    "Cannot divide by zero");

        return (float) operandOne/operandTwo;
    }
}
