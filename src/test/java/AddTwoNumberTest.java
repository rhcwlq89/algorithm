import org.junit.jupiter.api.Test;
import problem.addtwonumber.AddTwoNumber;
import problem.addtwonumber.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumberTest {
    AddTwoNumber addTwoNumber = new AddTwoNumber();

    @Test
    void addTwoNumberByListNode() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(6);
        AddTwoNumber addTwoNumber = new AddTwoNumber();

        ListNode listNode = addTwoNumber.addTwoNumbers(l1, l2);
        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    void addTwoNumberByList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<Integer> result = addTwoNumber.addTwoNumbers(list1, list2);
    }
}
