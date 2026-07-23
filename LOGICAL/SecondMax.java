// package DSA-LEETCODE-CODEFORCES-.LOGICAL;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {52, 23, 9, 21, 13, 44};
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                Smax = max;
                max = num;
            } else if (num > Smax && num != max) {
                Smax = num;
            }
        }

        System.out.println(Smax);
    }
}
