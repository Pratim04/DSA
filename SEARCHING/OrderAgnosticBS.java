// In this program the array is sorted but 
// we don't know that is the array is ascending 
// order sorted or descending order sorted ?

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers in sorted manner: ");

        Scanner in = new Scanner(System.in);
        int[] num = {-18, -12, -7, -5, 0, 7, 13, 15, 26, 35};
        int target = 13;
        int ans = OrderAgnosticBSfun(num, target);
        System.out.println(ans);
        in.close();
    }

    static int OrderAgnosticBSfun(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find wether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
