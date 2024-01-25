/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        inorder(root, map);
        
        int max = 0;
        for(int val : map.values()){
            if(val > max) max = val;
        }
        
        int n = 0;
        for(int val : map.values()){
            if(val == max) n++;
        }
        
        int ans[] = new int[n];
        int i=0;
        
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val == max){
                ans[i] = key;
                i++;
            }
        }
        
        return ans;
        
        
    }
    
    public void inorder(TreeNode root, HashMap<Integer,Integer> map){
        
        if(root == null) return;
        
        inorder(root.left, map);
        
        if(map.containsKey(root.val)){
             int val = map.get(root.val);
             map.put(root.val, val+1);
        }
        else{
            map.put(root.val, 1);
        }
        
        inorder(root.right, map);
    }
}