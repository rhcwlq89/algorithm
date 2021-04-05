package problem.addtwonumber;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddTwoNumber {

    public List<Integer> addTwoNumbers(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        ListIterator<Integer> integerListIterator1 = list1.listIterator();
        ListIterator<Integer> integerListIterator2 = list2.listIterator();
        int carry = 0;

        while(integerListIterator1.hasNext() || integerListIterator2.hasNext()) {
            int x = (integerListIterator1.next() != null) ? integerListIterator1.next():0;
            int y = (integerListIterator2.next() != null) ? integerListIterator2.next():0;
            int sum = carry + x + y;
            carry = sum / 10;

        }
        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}