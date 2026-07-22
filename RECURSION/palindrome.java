package RECURSION;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        String name;

        System.out.println("Enter a name: ");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();

        boolean result = palin(name,0);

        if (result) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static boolean palin(String s, int i) {
        if (i == s.length() - i - 1) return true;
        if (i >= s.length() - i - 1) return true;
        
        if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
            return palin(s, i + 1);
        }
        return false;
    }
}