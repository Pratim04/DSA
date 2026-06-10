package OOP.COLLECTIONS.List;

import java.util.Stack;

public class stackList {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(20);
        stk.push(21);
        stk.push(32);

        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
        System.out.println(stk.peek());
        stk.pop();
    }
}
