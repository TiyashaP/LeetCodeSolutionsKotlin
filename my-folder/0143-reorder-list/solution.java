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
    public void reorderList(ListNode head) {
        ListNode slowPointer=head;
        ListNode fastPointer=head.next;
        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        
       ListNode secondList=reverse(slowPointer.next);
       slowPointer.next=null;
       ListNode traverse=head;
       while(traverse!=null && secondList!=null)
       {
           ListNode firstNext=traverse.next;
           ListNode secondNext=secondList.next;
           traverse.next=secondList;
           secondList.next=firstNext;
           traverse=firstNext;
           secondList=secondNext;
       }
        
    }
    
    public ListNode reverse(ListNode current){
        ListNode previous=null;
        while(current!=null)
        {
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
        
    }
}
