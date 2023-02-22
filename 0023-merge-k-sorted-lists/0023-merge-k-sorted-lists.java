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
        
        
        Comparator<ListNode> custComp = new Comparator<ListNode>(){
            public int compare(ListNode a, ListNode b){
                return a.val - b.val;
            }
        };
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(custComp);
        
        
        for(ListNode curList : lists){
            if(curList != null)
            pq.offer(curList);
        }
        
        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;
        
        while(!pq.isEmpty()){
            ListNode t = pq.poll();
            
            
            ans.next = t;
            
            ans = t;
           
            
            
            if(t.next != null){
                pq.add(t.next);
            }
            
            
            
        }
        
        return dummy.next;
    }
}