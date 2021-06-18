import java.util.Stack;

public class Calculator {
    public float calculate(char op,
        float b, float a)
        {
            Operator operator = null;
            switch (op)
            {
                case Constants.ADD:
                    operator = new AdditionOperator();
                    break;
                case Constants.SUBTRACT:
                    operator = new SubtractionOperator();
                    break;
                case Constants.MULTIPLY:
                    operator = new MultiplicationOperator();
                    break;
                case Constants.DIVIDE:
                    operator = new DivisionOperator();
                    break;
            }

            return operator.operate(a,b);
        }
}


