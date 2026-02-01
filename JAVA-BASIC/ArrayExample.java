import java.util.Scanner;

public class ArrayExample {
    public static void main() {

        System.out.print("Enter the array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.print("Enter array elements: ");

        for (int i = 0;i<n;i++) {
            numbers[i] = sc.nextInt(); 
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}