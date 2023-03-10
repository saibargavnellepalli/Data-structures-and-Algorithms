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
    
    
    ArrayList<ListNode> list = new ArrayList<>();
    public Solution(ListNode head) {
       
        ListNode t = head;
        
        while(t != null){
           
            list.add(t);
            t=t.next;
        }
    }
    
    public int getRandom() {
       int ind = (int)(Math.random()*list.size());
        
        return list.get(ind).val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */