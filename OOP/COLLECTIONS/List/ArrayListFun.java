package OOP.COLLECTIONS.List;

import java.util.*;
class ArrayListFun {
    public static void main(String[] args) {
        // Reference with Collection so we don't have indexing
        Collection<Integer> num1 = new ArrayList<Integer>();
        num1.add(5);
        num1.add(52);
        num1.add(13);
        num1.add(7);
        System.out.println(num1);
        
        for (int n : num1) {
            System.out.println(n);
        }
        // Reference with List so we have indexing
        
        List<Integer> num2 = new ArrayList<Integer>();
        num2.add(5);
        num2.add(52);
        num2.add(13);
        num2.add(7);

        System.out.println(num2.get(2));
        System.out.println(num2);
    }
}