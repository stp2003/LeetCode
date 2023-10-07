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
    
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode currentHead = head;

        while (currentHead != null && currentHead.next != null) {
            
            if (currentHead.val == currentHead.next.val) {
                currentHead.next = currentHead.next.next;
            } else {
                currentHead = currentHead.next;
            }
        }

        return head;
        
    }
}

