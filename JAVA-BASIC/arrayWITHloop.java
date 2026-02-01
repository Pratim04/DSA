import java.util.*;

public class arrayWITHloop {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers: ");

        for(int i=0; i<nums.length ;i++) {
            nums[i] = sc.nextInt();
        }

        for(int num : nums) {
            System.out.print(num + " "); // Here num represents every element of the array
        }
        sc.close();
    }
}
