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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int[] preorderIndex = {0};
        return constructTree(preorder, inorder,preorderIndex,0, inorder.length-1);
    }
    
    private TreeNode constructTree(int[] preorder, int[] inorder, int[] preorderIndex,int inStart, int inEnd){
        
        if( preorderIndex[0] >= inorder.length || inStart > inEnd ){
            return null;
        }
        
        int currVal = preorder[preorderIndex[0]];
        
        TreeNode currNode = new TreeNode(currVal);
        
        preorderIndex[0]+=1;
        
        int i = -1;
        
        for(i = inStart; i<=inEnd; i++){
            
            if(inorder[i] == currVal)
                break;
        }
        
        
          currNode.left = constructTree(preorder, inorder, preorderIndex, inStart, i-1);
         currNode.right  = constructTree(preorder, inorder, preorderIndex, i+1, inEnd);
        
        return currNode;
        
        
    }
}