package OOP.COLLECTIONS.Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
    public static void main(String[] args) {
        // Queue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());

        // PQ.offer(2);
        // PQ.offer(3);
        // PQ.offer(5);
        // PQ.offer(4);
        
        // while (!PQ.isEmpty()) {
        //     System.out.println(PQ.poll());
        // }

        Queue<String> PQ = new PriorityQueue<>(Collections.reverseOrder());
    
        PQ.offer("Pratim");
        PQ.offer("Krittika");
        PQ.offer("Atim");
        PQ.offer("Agneesh");
        
        while (!PQ.isEmpty()) {
            System.out.println(PQ.poll());
        }
    }
}
