import java.util.List;

public class AddTwoNumbers {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int sum = 0;
        boolean carry = false;
        ListNode temp = result;
        while (l1 != null || l2 != null) {

            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (carry ? 1 : 0);
            carry = false;

            if (sum > 9) {
                carry = true;
            }

            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry) {
            temp.next = new ListNode(1);
        }


        return result.next;
    }

    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public static void main(String[] args) {
        AddTwoNumbers action = new AddTwoNumbers();

        ListNode test1_1 = new ListNode(3);
        ListNode test1_2 = new ListNode(4, test1_1);
        ListNode test1_3 = new ListNode(2, test1_2);
        ListNode test2_1 = new ListNode(4);
        ListNode test2_2 = new ListNode(6, test2_1);
        ListNode test2_3 = new ListNode(5, test2_2);
        ListNode result1_1 = new ListNode(8);
        ListNode result1_2 = new ListNode(0, result1_1);
        ListNode result1_3 = new ListNode(7, result1_2);
        ListNode result1 = action.addTwoNumbers(test1_3, test2_3);
        System.out.println(result1.val == result1_3.val && result1.next.val == result1_3.next.val && result1.next.next.val == result1_3.next.next.val);

    }
}
