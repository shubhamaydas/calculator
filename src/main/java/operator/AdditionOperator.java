package operator;

import operator.Operator;

public class AdditionOperator implements Operator {

    @Override
    public  int getPrecedence(){
        return 2;
    }

    @Override
    public float operate(Float operandOne, Float operandTwo)
    {
        return operandOne + operandTwo;
    }
}
