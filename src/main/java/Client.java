import java.util.Scanner;

public class Client
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
        System.out.println(expressionEvaluator.
                evaluate(expression));
    }
}

