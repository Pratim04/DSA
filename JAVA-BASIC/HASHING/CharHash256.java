package HASHING;

public package HASHING;
import java.util.*;

public class charHash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = in.next();

        // Pre-compute :
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }


        int q = in.nextInt();
        while (q-- > 0) {
            char c = in.next().charAt(0);
            // Fetching :
            System.out.println(c + " = " + hash[c]);
        }
    
    }
}
