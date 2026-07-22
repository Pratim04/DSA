

package SORTING;

class SelectionSort2 {
    public static void main(String[] args) {
        
        int[] arr = {13, 46, 24, 52, 20, 9};
        
        for(int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for(int j = i; j <= arr.length - 1; j ++) {
            
                if( arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int x = 0; x <= arr.length - 1; x++) {
            System.out.println(arr[x]);
        }
    }
}