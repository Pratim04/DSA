package RECURSION;
import java.util.*;

public class reverse {

    public static void main(String[] args) {
        System.out.println("Enter 5 numbers: ");
        Scanner in = new Scanner(System.in);
        
        int arr[] = new int[5];
        
        int e = arr.length-1, s=0;
        for (int i = 0; i <= e; i++) {
            arr[i] = in.nextInt();
        }
        
        rev(arr,s,e);
        
        for (int i = 0; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void rev(int[] arr, int s,int e) {
        // base case
        if (s >= e) return;

        // swap
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        // recursive call
        rev(arr,s+1,e-1);
    }
}