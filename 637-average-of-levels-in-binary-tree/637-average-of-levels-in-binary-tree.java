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
    public List<Double> averageOfLevels(TreeNode root) {
        
        
     List<Double> outerList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root!=null)
            q.add(root);
        else
            return outerList;
        
        while(!q.isEmpty()){
            
            int x = 0;
           
            
            int n = q.size();
            double avg = 0;
                
                while(x<n){
                
                TreeNode temp = q.peek();
                    
            
                q.remove();
                    
              avg+=temp.val;
                    
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);
                
                x++;
                
            }
            
       outerList.add(avg/n);
           
          
        }
        return outerList;
    }
}