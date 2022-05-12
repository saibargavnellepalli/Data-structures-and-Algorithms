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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Stack<List<Integer>> outerList = new Stack<>();
            Queue<TreeNode> q = new LinkedList<>();
          List<List<Integer>> list = new ArrayList<>();
        
        if(root!=null)
            q.add(root);
        else
            return list;
        
        while(!q.isEmpty()){
            
            int x = 0;
             List<Integer> Innerlist = new ArrayList<>();
            
            int n = q.size();
            while(x<n){
                
               
                
                TreeNode temp = q.peek();
                Innerlist.add(temp.val);
                q.remove();
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);
                
                x++;
                
            }
            
            outerList.push(Innerlist);
        }
        
      
        
        while(!outerList.isEmpty())
            list.add(outerList.pop());
        
        return list;
    }
}