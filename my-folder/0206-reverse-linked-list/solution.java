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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode traverse=head;
        while(traverse!=null)
        {
            ListNode next=traverse.next;
            traverse.next=prev;
            prev=traverse;
            traverse=next;
            
        }
        return prev;
    }
}
