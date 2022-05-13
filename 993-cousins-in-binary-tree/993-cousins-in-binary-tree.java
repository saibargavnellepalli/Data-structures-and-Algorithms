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
    public boolean isCousins(TreeNode root, int x, int y) {
        
       Queue<TreeNode> q = new LinkedList<>();
        
        int level = 0, lvl1=-1 , lvl2 = -1;
        
        Integer p1 = -1, p2 = -1;
        
        if(root != null)
            q.add(root);
        
        while(!q.isEmpty()){
            
            level+=1;
            int n = q.size();
            int i =0;
            
            while(i<n){
                
                TreeNode temp = q.poll();
                
                
                if( (temp.left != null && temp.left.val == x) || (temp.right!=null  && temp.right.val == x)){
                    
                    p1 = temp.val;
                    lvl1 = level;
                }
                
                      if( (temp.left != null && temp.left.val == y) || (temp.right!=null  && temp.right.val == y)){
                    
                    p2 = temp.val;
                    lvl2 = level;
                }
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right != null)
                    q.add(temp.right);
                
                i+=1;
            }
            
            if(p1 != -1 && p2 != -1){
                if(p1!=p2 && lvl1 == lvl2)
                    return true;
            }
        }
        
        return false;
    }
}
