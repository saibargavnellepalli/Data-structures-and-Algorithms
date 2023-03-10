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
    
    ListNode node;
    ArrayList<ListNode> list = new ArrayList<>();
    public Solution(ListNode head) {
       node = head;
        ListNode t = head;
        
        while(t != null){
           
            list.add(t);
            t=t.next;
        }
    }
    
    public int getRandom() {
       int ind = (int)(Math.random()*list.size());
                ListNode t = node;
                 for(int i=0;i<ind;i++){
                     t = t.next;
                 }
        return t.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */