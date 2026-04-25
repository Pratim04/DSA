package RECURSION;

public class Factorial {
    public static int Fact(int N) {
        if(N == 0) return 1;

        return N * Fact(N - 1);
    }

    public static void main(String[] args) {
        int num = 5;

        int x = Fact(5);

        System.out.println(x);
    }
}
