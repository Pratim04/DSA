import java.util.*;

public class whileLOOP {
    public static void main(String[] args) {
        System.out.print("Enter a value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        while (n!=0) {
            n--;
            System.out.println("Pratim");
        }
        sc.close();
    }
}
