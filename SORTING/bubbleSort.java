// It's Bubble Sort or Exchange Sort or Sinking Sort
// It's a stable order algorithm
// package SORTING;

import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter 5 elements: ");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Bubble(arr);

        System.out.println("Sorted Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

    static int[] Bubble(int[] arr) {

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true;
                }
            }
            if(!swapped == true) break;
        }
        return arr;
    }
}
