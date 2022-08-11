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
        
        if(head.next == null)
            return;
        
        ListNode sp = head, fp = head;
        
        while(fp.next != null && fp.next.next != null){
            sp = sp.next;
            fp = fp.next.next;
        }
       
        
      
        ListNode tempa = sp.next;
        sp.next = null;
        
        ListNode t1 = head;
        ListNode t2 = reverseList(tempa);
       
          ListNode  x= t1;
        while(x != null){
            System.out.println(x.val);
            x = x.next;
        }
        
        ListNode dupNode = head;
        ListNode next1 = t1;
        ListNode next2 = t2;
        
        int i=1;
        while(t2 != null){
            next1 = t1.next;
            
            //if(next2 != null)
            next2 = t2.next;
            
            if(i!=1){
                dupNode.next = t1;
                dupNode = dupNode.next;
            }
            
            dupNode.next = t2;
            i+=1;
            
            dupNode = dupNode.next;
            
            t1 = next1;
            t2 = next2;
            
        }
        
        if(t2 == null && t1 != null){
            dupNode.next = t1;
        }
        
        
    }
     public ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        ListNode t = null;
        ListNode prev = null;
        
        while(curNode != null){
            t = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = t;
        }
        
        return prev;
        
    }
}