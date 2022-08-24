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
    public int numComponents(ListNode head, int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int n : nums)
            set.add(n);
        
        int t=0, ans = 0;
        while(head != null){
            if(set.contains(head.val))
                t+=1;
            else{
                if(t!=0)
                ans += 1;
                t = 0;
            }
            head = head.next;
        }
        
        return t!=0 ? ans+1 : ans;
    }
}