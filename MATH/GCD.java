// package MATH;
import java.util.*;

public class GCD {
    public static void main(String[] args) {
        int num1 = 12, num2 = 14;
        
        int result = GCDF(num1, num2);

        System.out.println(result);
    }

    static int GCDF(int num1, int num2) {
        int gcd = 1;

        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}