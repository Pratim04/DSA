// import java.util.*;
public class CeilingNumber {
    public static void main(String[] args) {
        
        int[] num = {-18, -12, -10, -9, -7, -5, 0, 5, 24, 75};
        int target = 73;
        int ans = Ceiling(num, target);
        System.out.println("Result will be: " + ans);
    }
    static int Ceiling(int[] arr, int target) {
        
        if (target > arr[arr.length - 1]) {
            return -1;
        }
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
        return start;
    }
}
