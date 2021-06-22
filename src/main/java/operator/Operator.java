package operator;

public interface Operator {
    float operate(Float operandOne, Float operandTwo);
    int getPrecedence();
}
