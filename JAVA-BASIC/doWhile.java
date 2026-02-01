import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        System.out.print("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int R = add(num);
        System.out.print("Sum of the digits is:"+ R);
        sc.close();
    }

    public static int add(int args) {
        int mod,sum = 0 ,n = args;
        do {
            mod = n % 10;
            n = n / 10; 
            sum = sum + mod;
        }while(n>0);
        return sum;
    }
    
}
