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
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(0);
        ListNode p = l1, q = l2, curr = temp;
        int carry = 0;

        while (p != null || q != null) {
            
            //** for checking wheather both list have same digit, if nor then put 0.
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);

            curr = curr.next;

            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }

        //** if an extra carry is there then make a new connection to the ll.
        //** 900 + 900 = 1800
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return temp.next;
    }
}
