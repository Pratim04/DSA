import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        
        System.out.print("Enter 10 numbers in sorted manner: ");
        
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        System.out.print("Enter the Target: ");
        int target = in.nextInt();
        
        int ans = Binary(num, target);
        if (ans == 1) {
            System.out.println("Target is on " + ans + " index.");
        }
        else {
            System.out.println("The target is not in the array!");
        }
        in.close();
    }
    static int Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target>arr[mid]) {
                start = mid + 1;
            }
            else if (target<arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
