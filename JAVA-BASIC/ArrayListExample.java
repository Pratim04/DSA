import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        
        System.out.println("Enter numbers : ");
        Scanner sc = new Scanner(System.in);
        // The initial value is 10 but It can recive more that 10
        ArrayList<Integer> list = new ArrayList<>(5);
        
        // Input
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        // Output
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }
        sc.close();
    }
}
