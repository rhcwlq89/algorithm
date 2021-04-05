import org.junit.jupiter.api.Test;
import problem.addtwonumber.AddTwoNumber;
import problem.addtwonumber.ListNode;

public class AddTwoNumberTest {

    @Test
    void addTwoNumber() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(6);
        AddTwoNumber addTwoNumber = new AddTwoNumber();

        ListNode listNode = addTwoNumber.addTwoNumbers(l1, l2);
        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
