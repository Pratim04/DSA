package RECURSION;

public class PrintNumbers {
    public static void main(String[] args) {
        int a = 5;
        num(a);
    }

    static void num(int n) {
        if (n == 0) {
            return;
        }

        num(n-1);
        System.out.println(n);
    }
}