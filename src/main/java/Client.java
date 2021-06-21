import java.util.Scanner;

public class Client
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        Calculator calculator = new Calculator();
        try {

            System.out.println(calculator.
                    calculate(expression));
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());
        }catch (Exception exception){
            System.out.println("Error in processing");
        }
    }
}

