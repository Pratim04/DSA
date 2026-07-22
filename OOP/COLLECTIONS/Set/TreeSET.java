package OOP.COLLECTIONS.Set;

import java.util.*;

public class TreeSET {
    public static void main(String[] args) {
        Set<Integer> num1 = new TreeSet<>();
        num1.add(5);
        num1.add(52);
        num1.add(13);
        num1.add(7);
        num1.add(7);

        // System.out.println(num1);

        // for(int n : num1) {
        //     System.out.println(n);
        // }

        // we have an interface called iterator Which can iterate through elements without loops

        Iterator<Integer> values = num1.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}

// If we need sorted manner values we have to use TreeSet
