import java.util.Stack;

public class Calculator {
    public float calculate(String expression) {
        {
            char[] tokens = expression.replace(" ", "")
                    .toCharArray();
            Stack<Float> values = new
                    Stack<>();
            Stack<Operator> operatorStack = new
                    Stack<>();
            Tokenizer tokenizer = new Tokenizer();

            for (int position = 0; position < tokens.length; position++)
            {
                if(tokenizer.isCharPartOfNumber(tokens[position]))
                {
                    String result = tokenizer.getNextFloatNumber(tokens, position);
                    values.push(Float.parseFloat(result));
                    position = position + result.length() - 1;
                }

                else if (tokenizer.isCharAnOperator(tokens[position]))
                {
                    Operator currentOperator =  tokenizer.getNextOperator(tokens, position);
                    while (!operatorStack.empty() && hasPrecedence(currentOperator, operatorStack.peek())) {
                        float firstValue = values.pop();
                        float secondValue = values.pop();
                        values.push(operatorStack.pop().operate(secondValue, firstValue));
                    }

                    operatorStack.push(currentOperator);
                }

                else {
                    throw new IllegalArgumentException("Invalid input string");
                }
            }

            while (!operatorStack.empty()){
                float firstValue = values.pop();
                float secondValue = values.pop();
                values.push(operatorStack.pop().operate(secondValue, firstValue));
            }

            return values.pop();
        }
    }

    private boolean hasPrecedence(Operator currentOperator , Operator operatorInStack){
        if(currentOperator.getPrecedence() == 1 && operatorInStack.getPrecedence() == 2)
            return false;
        return true;
    }

}


