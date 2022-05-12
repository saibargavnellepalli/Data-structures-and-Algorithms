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
    public int maxDepth(TreeNode root) {
        
     
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root!=null)
            q.add(root);
        else
            return 0;
        
        int height = 0;
        while(!q.isEmpty()){
            
            int x = 0;
            height +=1;
            
            int n = q.size();
            
                
                while(x<n){
                
                TreeNode temp = q.peek();
               
                q.remove();
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);
                
                x++;
                
            }
            
           
        }
        return height;
    }
}