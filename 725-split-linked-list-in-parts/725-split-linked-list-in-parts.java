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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
       
        ListNode lenNode = head;
        int n = 1;
        
          while(lenNode != null && lenNode.next != null){
            n += 1;
            lenNode = lenNode.next;
        }
      
        
         ListNode[] arr = new ListNode[k];
        int p = n/k, r=n%k;
        
        ListNode cur = head;
        
        for(int i=0;i<k;i++){
            
            arr[i] = cur;
            int j=1,end=p;
            if(r>=1){
                end += 1;
                r-=1;
            }
            if(cur == null){
                arr[i] = null;
            }
            else{
                
            while( j<end){
                cur = cur.next;
                j++;
            }
            
           
            ListNode t = cur.next;
            cur.next = null;
            cur = t;
            
            }
        }
        
        return arr;
        
    }
}