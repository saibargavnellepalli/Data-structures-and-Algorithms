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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        boolean[] arr = new boolean[1];
       
        twoSum(root,set,arr,k);
        return arr[0];
    }
    
    private void twoSum(TreeNode root, HashSet<Integer> set, boolean[] arr, int k){
        if(root == null)
            return;
        twoSum(root.left,set,arr,k);
        
        if(set.contains(k-root.val)){
            arr[0] = true;
        }
        else{
            set.add(root.val);
        }
          twoSum(root.right,set,arr,k);
        return;
    }
}