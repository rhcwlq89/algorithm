package datastructure.queue;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueApp {

    public void testInputOutput() {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
