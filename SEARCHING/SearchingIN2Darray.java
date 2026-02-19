// Q: Matrix is Sorted in a row and coloum manner

import java.util.Arrays;

public class SearchingIN2Darray {

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 39}
        };

        System.out.println(Arrays.toString(TwoDSearch(arr, 37)));
    }

    public static int[] TwoDSearch(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r< matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r,c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}