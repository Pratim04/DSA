package METHODS;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int result = add(num1, num2);

        System.out.printf("Result is %d%n", result);
        in.close();
    }

    static int add(int a, int b) {
        return a + b;
    }
}
