import java.util.*;
// package JAVA-BASIC.COLLECTIONS.Set;

public class hashSET {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>();
        num1.add(5);
        num1.add(52);
        num1.add(13);
        num1.add(7);
        num1.add(7);

        // System.out.println(num1);

        for(int n : num1) {
            System.out.println(n);
        }
    }
}

// Set does't support index values
// It's and unordered way of storing values