package RECURSION;

public class OneTOn {
    public static void main(String[] args) {
        int num = 5,i = 0;
        rec(num,i);
    }

    public static void rec(int num,int i) {
        if (i > num) return;

        System.out.print(i + " ");
        rec(num,i+1);
    }
}
