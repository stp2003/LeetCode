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
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head == null) return head;
        
        ListNode temp = null;
        ListNode curr = head;
        ListNode prev = null;
        
        int c = 0;
        
        while(curr != null && c < k) {
            curr = curr.next;
            c++;
        }
        
        curr = head;
        
        if(c == k) {
            c = 0;
            
            while(curr != null && c < k) {
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                
                c++;
            }
        }
        
        else {
            prev = head;
        }
        
        if(temp != null) {
            head.next = reverseKGroup(temp, k);
        }
        
        return prev;
        
    }
}