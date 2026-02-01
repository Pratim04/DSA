import java.util.*;
public class Max {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = a;

        if (b>max) {
            max = b;
        }
        if (c>max) {
            max = c;
        }
        System.out.println(max + " is max");

        sc.close();
    }
}
