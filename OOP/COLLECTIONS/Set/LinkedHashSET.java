package OOP.COLLECTIONS.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSET {
    public static void main(String[] args) {
        // LinkedHashSet<Integer> Set1 = new LinkedHashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
b 
        set1.add(22);
        set1.add(12);
        set1.add(65);
        set1.add(73);
        set1.add(10);

        for (int x : set1) {
            System.out.println(x);
        }

    }
}
