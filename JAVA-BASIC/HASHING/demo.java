package HASHING;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        int[] hash = new int[13];
        int size = arr.length;
        System.out.println("Enter 5 numbers : ");
        
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        
        
        int k = 0;
        while (k < size) {
            hash[arr[k]] += 1;
            k++;
        }

        System.out.println("How many Query? : ");
        int q = in.nextInt();
        while (q-- > 0) {
            System.out.println("Enter Query: ");
            int num = in.nextInt();
            System.out.println(num + " = " +hash[num]);
            
        }
    }
}
