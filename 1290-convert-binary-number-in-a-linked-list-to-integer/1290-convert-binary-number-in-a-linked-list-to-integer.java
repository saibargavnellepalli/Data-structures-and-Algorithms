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
    public int getDecimalValue(ListNode head) {
        
        String s = "";
        while(head != null){
            s += head.val;
            head = head.next;
        }
        
        int ans = 0;
        int base = 1;
        for(int i=s.length()-1;i>=0;i--){
            
            if(s.charAt(i)=='1'){
                ans += base;
            }
            base += base;
        }
        return ans;
    }
}