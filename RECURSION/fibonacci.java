package RECURSION;

public class fibonacci {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.println(fib(i));
        }
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
