import service.Calculator;

public class EvaluateExpression {

    public float getResult(String expression){

        Calculator calculator = new Calculator();
        while (expression.indexOf(')')!=-1) {
            int closing_braces = expression.indexOf(')');
            String firstSubstringPart = expression.substring(0, closing_braces);
            int opening_braces = firstSubstringPart.lastIndexOf('(');
            String subString = expression.substring(opening_braces + 1, closing_braces);
            String subStringWithBraces = expression.substring(opening_braces, closing_braces + 1);
            float number = calculator.calculate(subString);
            expression =  expression.replace(subStringWithBraces, number + "");
        }
        return calculator.calculate(expression);
    }
}

