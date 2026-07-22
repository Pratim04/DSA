package RECURSION;

public class findZeros {

    public static void main(String[] args) {
        int num = 3040850,c = 0;
        int count = fZero(num, c);
        System.out.println(count);
    }

    static int fZero(int num,int c) {
        if (num == 0) {
            return c;
        }

        if (num%10 == 0) {
            ++c;
        }
        return fZero(num/10,c);
    }
}