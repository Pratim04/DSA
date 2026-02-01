import java.util.*;

public class condition {
    public static void main(String[] args) {
        System.out.println("Enter Your age: ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("Adult 18+");
        }
        else {
            System.out.println("Under-age");
        }
        sc.close();
    }
}
