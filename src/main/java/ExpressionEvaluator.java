import java.util.Stack;

public class ExpressionEvaluator {
    public float evaluate(String expression){
            char[] tokens = expression.toCharArray();
            Calculator calculator = new Calculator();
            Stack<Float> values = new
                    Stack<>();
            Stack<Character> ops = new
                    Stack<>();

            for (int i = 0; i < tokens.length; i++)
            {

                if (tokens[i] == Constants.SPACE)
                    continue;

                if (tokens[i] >= Constants.ZERO &&
                        tokens[i] <= Constants.NINE)
                {
                    StringBuffer sbuf = new
                            StringBuffer();

                    while (i < tokens.length &&
                            tokens[i] >= Constants.ZERO &&
                            tokens[i] <= Constants.NINE){
                        sbuf.append(tokens[i++]);
                    }

                    values.push(Float.parseFloat(sbuf.
                            toString()));

                    i--;
                }

                else if (tokens[i] == Constants.OPENING_BRACES)
                    ops.push(tokens[i]);

                else if (tokens[i] == Constants.CLOSING_BRACES)
                {
                    while (ops.peek() != Constants.OPENING_BRACES)
                        values.push(calculator.calculate(ops.pop(),
                                values.pop(),
                                values.pop()));
                    ops.pop();
                }

                else if (tokens[i] == Constants.ADD ||
                        tokens[i] == Constants.SUBTRACT ||
                        tokens[i] == Constants.MULTIPLY ||
                        tokens[i] == Constants.DIVIDE)
                {
                    while (!ops.empty() &&
                            Util.hasPrecedence(tokens[i],
                                    ops.peek()))
                        values.push(calculator.calculate(ops.pop(),
                                values.pop(),
                                values.pop()));

                    ops.push(tokens[i]);
                }
            }

            while (!ops.empty())
                values.push(calculator.calculate(ops.pop(),
                        values.pop(),
                        values.pop()));

            return values.pop();
        }
}
