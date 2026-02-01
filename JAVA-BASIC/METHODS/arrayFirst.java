package METHODS;

public class arrayFirst {
    public static void main(String[] args) {
        // Integer array will return 0 if there is nothing in the index
        int[] arr;
        arr = new int[10];
        System.out.println(arr[2]);
        
        // Srting array will return null if there is nothing in the index
        String[] srr = new String[5];
        System.out.println(srr[2]);
    }
}
