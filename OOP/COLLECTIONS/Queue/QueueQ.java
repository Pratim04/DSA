package OOP.COLLECTIONS.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQ {
    public static void main(String[] args) {
        Queue<Integer> Qu = new LinkedList<>();
        Qu.offer(1);
        Qu.offer(2);

        System.out.println(Qu.peek());
        System.out.println(Qu.poll());
        System.out.println(Qu.peek());
        System.out.println(Qu.isEmpty());

    }
}
