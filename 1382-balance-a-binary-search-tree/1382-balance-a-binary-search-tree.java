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
    public TreeNode balanceBST(TreeNode root) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        inorder(root,arr);
        
       return constructBalBST(0,arr.size()-1,arr);
    }
    
    private TreeNode constructBalBST( int start, int end, ArrayList<Integer> arr){
        
        if(start > end)
            return null;
        
        int mid = start+(end-start)/2;
        TreeNode newNode = new TreeNode(arr.get(mid));
        
        newNode.left = constructBalBST(start,mid-1,arr);
        newNode.right = constructBalBST(mid+1,end,arr);
        
        return newNode;
        
    }
    
    //gives inorder of bst (or) sorted array
    private void inorder(TreeNode root,  ArrayList<Integer> arr){
        
        if(root == null)
            return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}