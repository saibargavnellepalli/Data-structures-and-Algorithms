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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int[] postOrderIndex = new int[1];
        postOrderIndex[0] = inorder.length-1;
      return constructTree(inorder,postorder,0,inorder.length-1,postOrderIndex);
        
        
    }
    private TreeNode constructTree(int[] inorder, int[] postorder, int inStart, int inEnd, int[] postOrderIndex){
        
        if( inStart > inEnd){
            return null;
        }
        
        TreeNode node = new TreeNode(postorder[postOrderIndex[0]]);
   
        
        int i;
        for(i = 0; i<inorder.length; i++){
            
            if(inorder[i] == postorder[postOrderIndex[0]])
                break;
        }
        
             postOrderIndex[0] -= 1;
        node.right = constructTree(inorder, postorder, i+1, inEnd,postOrderIndex );
        node.left = constructTree(inorder, postorder, inStart, i-1,postOrderIndex );
        
        return node;
        
        
    } 
}