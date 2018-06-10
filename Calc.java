import java.util.Scanner;

public class Calc {
    public static void main(String[] args)
    {
        System.out.println("Calculator");
        System.out.print("Enter operation: ");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        char operation = in.next().charAt(0);
        double b = in.nextDouble();

        switch (operation) {
        case '+':
            System.out.printf("%f + %f = %f", a, b, a + b);
            break;
        case '-':
            System.out.printf("%f - %f = %f", a, b, a - b);
            break;
        case '*':
            System.out.printf("%f * %f = %f", a, b, a * b);
            break;
        case '/':
            System.out.printf("%f / %f = %f", a, b, a / b);
            break;
        default:
            System.out.println("Unknown operation!");
            break;
        }
    }
}
