package operator;

import operator.Operator;

public class MultiplicationOperator implements Operator {
    @Override
    public  int getPrecedence(){
        return 1;
    }
    @Override
    public float operate(Float operandOne, Float operandTwo) {
        return operandOne * operandTwo;
    }
}
