import java.util.*;
public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        switch (value) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Default case");
        }
        
        sc.close();
    }
}
