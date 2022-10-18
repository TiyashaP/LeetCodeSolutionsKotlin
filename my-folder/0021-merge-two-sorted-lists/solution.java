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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        ListNode current=null;
         ListNode prev=null;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                  current=new ListNode(list1.val,null);  
                  list1=list1.next;
        
            }
            else{
                current=new ListNode(list2.val,null);
                list2=list2.next;
                
            }
            if(head==null)
            {head=current;
             prev=head;
            }
            else{
                 prev.next=current;
                 prev=current;
            }
            
        }
        
         while(list1!=null)
        {
            current=new ListNode(list1.val,null);  
            list1=list1.next;
            if(head==null)
            {head=current;
             prev=head;
            }
            else{
                 prev.next=current;
                 prev=current;
            }
        
        }
         while(list2!=null)
        {
            current=new ListNode(list2.val,null);  
            list2=list2.next;
            if(head==null)
            {head=current;
             prev=head;
            }
            else{
                 prev.next=current;
                 prev=current;
            }
        }
        
    return head;
    }
}
