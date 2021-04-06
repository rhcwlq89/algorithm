package add.two.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problem.add.two.number.AddTwoNumber;
import problem.add.two.number.ListNode;

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
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);

        Assertions.assertIterableEquals(expected, result);

        List<Integer> list3 = new ArrayList<>();
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        List<Integer> list4 = new ArrayList<>();
        list4.add(9);
        list4.add(9);
        list4.add(9);

        List<Integer> result2 = addTwoNumber.addTwoNumbers(list3, list4);
        List<Integer> expected2 = new ArrayList<>();
        expected2.add(1);
        expected2.add(0);
        expected2.add(9);
        expected2.add(9);
        expected2.add(8);

        Assertions.assertIterableEquals(expected2, result2);
    }
}

