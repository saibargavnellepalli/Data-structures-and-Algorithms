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
    public TreeNode searchBST(TreeNode root, int key) {
            
       TreeNode CurrentPointer = root;
        
        while (CurrentPointer != null){
            
            if(CurrentPointer.val == key)
                return CurrentPointer;
            if(CurrentPointer.val > key)
                CurrentPointer = CurrentPointer.left;
            else if(CurrentPointer.val < key )
                CurrentPointer = CurrentPointer.right;
        }
        return null;
        }
    }
