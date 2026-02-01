import java.util.*;
public class TwoD_Array {
    public static void main(String[] args) {
        
        /* 
            1 5 8
            4 5
            3 2 6 7
            This is possible because these are taken by java as an object
        */

        // int[][] test = {
        //     {1, 5, 8},
        //     {4, 5},
        //     {3, 2, 6, 7}
        // };

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        System.out.println("Enter Numbers: ");
        Scanner in = new Scanner(System.in);
        int[][] mat = new int[3][3];
        
        // INPUT
        for (int row = 0; row< mat.length; row++) {

            for (int col = 0; col< mat.length; col++) {
                mat[row][col] = in.nextInt();
            }
        }
        
        // OUTPUT
        // for (int row = 0; row< mat.length; row++) {

        //     for (int col = 0; col< mat.length; col++) {
        //         System.out.print(mat[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        for(int[] a : mat) {
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}
