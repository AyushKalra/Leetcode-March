/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     if (headA == null || headB == null) {
            return null;
        }
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int lenA = 0;
        int lenB = 0;
        while (nodeA.next != null) {
            nodeA = nodeA.next;
            lenA++;
        }
        while (nodeB.next != null) {
            nodeB = nodeB.next;
            lenB++;
        }
        if (nodeA != nodeB) {
            return null;
        }
        nodeA = headA;
        nodeB = headB;
        if (lenA > lenB) {
            int diff = lenA - lenB;
            while (diff > 0) {
                nodeA = nodeA.next;
                diff--;
            }
        } else if (lenB > lenA) {
            int diff = lenB - lenA;
            while (diff > 0) {
                nodeB = nodeB.next;
                diff--;
            }
        }
        
        while (nodeA != nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    
    }
}