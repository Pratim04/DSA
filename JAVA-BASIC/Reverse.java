import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size if the Array : ");
        int size = sc.nextInt();
        
        System.out.print("Enter " + size + " numbers : ");
        int[] arr = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        DoReverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void DoReverse(int[] a) {
        int start = 0;
        int end = a.length-1;

        while (start < end) {
            swap.Swap(a,start,end);
            start++;
            end--;
        }
    }
}
