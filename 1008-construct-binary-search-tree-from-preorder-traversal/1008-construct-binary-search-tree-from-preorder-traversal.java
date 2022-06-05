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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        int arr[]  = new int[1];
        arr[0] = 0;
        return buildTree(preorder,arr,Integer.MAX_VALUE);
    }
    
    private TreeNode buildTree(int[] preorder, int[] arr,int boundvalue){
        
        if(arr[0] >= preorder.length || preorder[arr[0]] > boundvalue)
            return null;
        
          TreeNode newNode = new TreeNode(preorder[arr[0]]);
          arr[0] += 1;
        
        newNode.left = buildTree(preorder,arr,newNode.val);
        newNode.right = buildTree(preorder,arr,boundvalue);
        
        return newNode;
        
        
        

        
    }
}