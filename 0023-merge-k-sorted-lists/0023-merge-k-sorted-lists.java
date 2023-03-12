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
    public ListNode mergeKLists(ListNode[] lists) {
       // if(lists == null || lists.size()== 0) return null;
        
        Comparator<ListNode> custComp = new Comparator<ListNode>(){
          public int compare(ListNode a, ListNode b){
              return a.val-b.val;
          }  
        };
        PriorityQueue<ListNode> pq = new PriorityQueue<>(custComp);;
        
        for(ListNode curList : lists){
            if(curList != null)
            pq.offer(curList);
        }
        
        ListNode ansNode = new ListNode(-1);
        ListNode dummyHead = ansNode;
        
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            
            ansNode.next = temp;
            ansNode = ansNode.next;
            
            temp = temp.next;
            
            if(temp != null)
                pq.offer(temp);
        }
        
        return dummyHead.next;
    }
}