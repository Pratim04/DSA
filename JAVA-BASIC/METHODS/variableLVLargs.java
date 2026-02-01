package METHODS;

import java.util.Arrays;

public class variableLVLargs {
    public static void main(String[] args) {
        fun(2,3,7,5);
    }
    // "...v" It's called Veriable Level Arguments.
    // where the length is not constant it's adaptive.
    // It should be always in the end.
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
