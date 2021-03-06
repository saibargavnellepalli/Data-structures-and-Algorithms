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
        
         HashMap<Integer,Integer> inorderMap = buildMap(inorder);
        
        int[] postOrderIndex = new int[1];
        postOrderIndex[0] = inorder.length-1;
      return constructTree(inorder,postorder,0,inorder.length-1,postOrderIndex,inorderMap);
        
        
    }
    
     private HashMap<Integer,Integer> buildMap(int[] inorder){
        
          HashMap<Integer,Integer>  hash = new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
            hash.put(inorder[i],i);
        }
        
        return hash;
    }
    
    private TreeNode constructTree(int[] inorder, int[] postorder, int inStart, int inEnd, int[] postOrderIndex,   HashMap<Integer,Integer> inorderMap ){
        
        if( inStart > inEnd){
            return null;
        }
        
        TreeNode node = new TreeNode(postorder[postOrderIndex[0]]);
   
        
        int i = inorderMap.get( postorder[postOrderIndex[0]]);
  
        
             postOrderIndex[0] -= 1;
        node.right = constructTree(inorder, postorder, i+1, inEnd,postOrderIndex, inorderMap);
        node.left = constructTree(inorder, postorder, inStart, i-1,postOrderIndex, inorderMap);
        
        return node;
        
        
    } 
}