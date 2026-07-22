// package HASHING;
import java.util.*;

public class NumberHashing {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = in.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter element for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        // Precompute
        int[] hash = new int[13];
        for (int j = 0; j < n; j++) {
            hash[arr[j]] += 1;
        }
        
        int q;
        System.out.println("Enter Query numbers: ");
        q = in.nextInt();

        System.out.println("Enter queries: ");
        while(q-->0) {
            int number = in.nextInt();
            System.out.println(number + " = " + hash[number]);
        }
        in.close();
    }
}