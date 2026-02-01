import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] Num = new int[10];
        System.out.print("Enter 10 Numbers: ");

        for (int i = 0; i < Num.length; i++) {
            Num[i] = in.nextInt();
        }

        System.out.println("Enter the key: ");
        int target = in.nextInt();

        int ans = linear(Num, target);
        System.out.println("Element at "+ ans +"'s position");

        in.close();
    }

    static int linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return (index + 1);
            }
        }
        return -1;
    }
}
