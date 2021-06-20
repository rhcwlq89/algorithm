package datastructure.queue;


import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueStudy {

    public void testInputOutput() {
        Queue<Integer> pQ = new PriorityQueue<>();

        pQ.offer(5);
        pQ.offer(1);
        pQ.offer(2);
        pQ.offer(3);
        pQ.offer(4);
        pQ.offer(5);

        while(!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }

    }
}
