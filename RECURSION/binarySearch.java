package RECURSION;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 9, 12, 32, 45 };
        int target = 32, s = 0, e = arr.length - 1;
        
        
        System.out.println(Binary(s, e, arr, target));
    }

    static int Binary(int s, int e, int[] arr, int target) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return Binary(s, m - 1, arr, target);
        }

        return Binary(m, e, arr, target);
    }
}