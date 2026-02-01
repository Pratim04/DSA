import java.util.*;

public class swap {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Swap(arr,0,3);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void Swap(int arr[], int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
