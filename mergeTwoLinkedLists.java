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
class mergeTwoLinkedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     
        if(l1==null) return l2;
        else if(l2==null) return l1;
        
        ListNode retv=new ListNode(-1);
        ListNode head=retv;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                retv.next=l1;
                l1=l1.next;
            }
            else
            {
                retv.next=l2;
                l2=l2.next;                
            }
           retv=retv.next;
        }
        
        while(l1!=null)
        {
                retv.next=l1;
                l1=l1.next;
            retv=retv.next;
        }
        
         while(l2!=null)
        {
                retv.next=l2;
                l2=l2.next;
             retv=retv.next;
        }
        return head.next;
    }
}