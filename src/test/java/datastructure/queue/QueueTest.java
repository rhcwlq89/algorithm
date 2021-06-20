package datastructure.queue;


import org.junit.jupiter.api.Test;


public class QueueTest {
    PriorityQueueApp priorityQueueApp = new PriorityQueueApp();
    LinkedListApp linkedListApp = new LinkedListApp();

    @Test
    public void PriorityQueueInputOutputTest() {
        priorityQueueApp.testInputOutput();
        linkedListApp.testInputOutput();
    }

}
