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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
            return null;
        ListNode reversed=reversed(head);
        ListNode previous=null;
        ListNode current=reversed;
        int count=1;
        while(count<n && current!=null)
        {
            previous=current;          
            current=current.next;
            count++;
        }
        if(previous==null)
        {
            previous=current.next;
            reversed=previous;
            current.next=null;
        }
        else{
        previous.next=current.next;
             current.next=null;
        }
        reversed=reversed(reversed);
        
        return reversed;
        
    }
    
    public static ListNode reversed(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        while(current!=null)
        {
            ListNode temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
            
        }
        return previous;
        
    }
}
