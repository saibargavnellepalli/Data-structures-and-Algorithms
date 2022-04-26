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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
       
        //See what to add into the stack 
        // 1) stack is of Int type or any other?
        // 2) What to be added to stack, left/right 
        
        Stack<TreeNode> stack = new Stack<>();
        
        if (root == null)
            return ans;
        else
          stack.add(root);
            
        
        while(!stack.isEmpty()){
          TreeNode curr = stack.peek();
            ans.add(curr.val);
            stack.pop();
            
              if(curr.right!=null)
                stack.add(curr.right);
            
            if(curr.left!=null)
                stack.add(curr.left);
            
          
            
            
        }
        
        return ans;
          
    }
                                       
                                      
                            
}