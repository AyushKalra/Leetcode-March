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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode fast = head, slow =head;
       
        ListNode n1, n2;
        for(int i=0; i<k-1; i++){
            fast = fast.next;
        }
        n1 = fast;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        n2 = slow;
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
        return head;
    }
}