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
    boolean firstOcurrence = true;
    TreeNode preNode = new TreeNode(Integer.MIN_VALUE);
    TreeNode Node1 = null;
    TreeNode Node2 = null;
    public void recoverTree(TreeNode root) {
        
        correctTree(root);
        System.out.println(Node2.val +" "+Node1.val);
        //swap wrong elements
        int temp = Node2.val;
        Node2.val = Node1.val;
        Node1.val = temp;
    }
    private void correctTree(TreeNode root){
        
        //base case
        if(root == null)
            return;
        
        //left call
        correctTree(root.left);
        
        //find wrong indices
        if(preNode.val > root.val){
            
            if(firstOcurrence){
                Node1 = preNode;
                firstOcurrence = false;
            }
            Node2 = root;
        }
        preNode = root;
        
        //right call
        correctTree(root.right);
        
        return;
    }
}