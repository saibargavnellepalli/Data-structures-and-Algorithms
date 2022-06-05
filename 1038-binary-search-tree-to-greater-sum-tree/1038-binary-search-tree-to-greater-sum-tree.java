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
    public TreeNode bstToGst(TreeNode root) {
        
       // ArrayList<Integer> arr = new ArrayList<>();
        int sum[] = new int[1];
        inorder(root,sum);
        int count[] = new int[2];
       
      // System.out.print(sum[0]);
        count[0] =0;
        count[1] = sum[0];
      
        gst(root,count);
        
        return root;
        
    }
    
    //convert bst to gst
    private void gst(TreeNode root,int[] count){
        
        if(root == null)
            return;
        gst(root.left,count);
        
        count[0] += root.val;
        root.val += count[1]-count[0];
        
        System.out.print(count[0] +" "+count[1]);
        System.out.println();
        
       
            
        gst(root.right,count);
    }
    
    
    
   
    
    //gives sorted array
    private void inorder(TreeNode root, int[] sum){
        if(root == null)
            return;
        inorder(root.left,sum);
        sum[0] += root.val;
        inorder(root.right,sum);
        
    }
}