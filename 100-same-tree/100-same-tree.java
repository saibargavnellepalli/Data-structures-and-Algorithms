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

class Pair{
    TreeNode p;
    TreeNode q;
    
    Pair(TreeNode p, TreeNode q)
    {
         this.p = p;
         this.q = q;
    }
}
class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        
        
        Queue<Pair> q1 = new LinkedList<>();
        
        q1.add(new Pair(root1, root2));
        
        while(!q1.isEmpty()){
            
            Pair temp = q1.poll();
            TreeNode t1 = temp.p;
            TreeNode t2 = temp.q;
            
            if(t1==null && t2==null)
                continue;
            
            if(t1 == null || t2 == null || t1.val != t2.val)
                return false;
            
            q1.add(new Pair(t1.left,t2.left));
             q1.add(new Pair(t1.right,t2.right));
            
        }
        return true;
     
    }
}