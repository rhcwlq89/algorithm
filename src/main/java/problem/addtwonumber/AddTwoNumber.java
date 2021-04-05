package problem.addtwonumber;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumber {

    public List<Integer> addTwoNumbers(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;

        for(int i = 1; i <= list1.size() || i <= list2.size(); i++) {
            int x = list1.size() - i >= 0 ? list1.get(list1.size() - i) : 0;
            int y = list2.size() - i >= 0 ? list2.get(list2.size() - i) : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            result.add(0, sum % 10);
        }

        if(carry > 0) {
            result.add(0, carry);
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
