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
        HashMap<Integer,Integer> inorderMap = buildMap(inorder);
        
        return constructTree(preorder, inorder,preorderIndex,0, inorder.length-1,inorderMap);
    }
    
    private HashMap<Integer,Integer> buildMap(int[] inorder){
        
          HashMap<Integer,Integer>  hash = new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
            hash.put(inorder[i],i);
        }
        
        return hash;
    }
    private TreeNode constructTree(int[] preorder, int[] inorder, int[] preorderIndex,int inStart, int inEnd,  HashMap<Integer,Integer> inorderMap ){
        
        if( preorderIndex[0] >= inorder.length || inStart > inEnd ){
            return null;
        }
        
        int currVal = preorder[preorderIndex[0]];
        
        TreeNode currNode = new TreeNode(currVal);
        
        preorderIndex[0]+=1;
        
       int i = inorderMap.get(currVal);
        
        
          currNode.left = constructTree(preorder, inorder, preorderIndex, inStart, i-1,  inorderMap );
         currNode.right  = constructTree(preorder, inorder, preorderIndex, i+1, inEnd, inorderMap );
        
        return currNode;
        
        
    }
}