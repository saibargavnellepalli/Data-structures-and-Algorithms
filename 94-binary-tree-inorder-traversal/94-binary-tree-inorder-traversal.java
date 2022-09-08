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
    public List<Integer> inorderTraversal(TreeNode root) {
       
        Stack<TreeNode> st = new Stack<>();
                 List<Integer> ans = new ArrayList<>();
 if(root==null)
            return ans;
        addLeftSubTree(root,st);
        
        while(st.isEmpty() == false){
            TreeNode t = st.peek();
            st.pop();
            ans.add(t.val);
            if(t.right != null){
               addLeftSubTree(t.right,st); 
            }
        }
        return ans;
    }
    
    public void addLeftSubTree(TreeNode root, Stack<TreeNode> st){
        st.push(root);
        while(root.left != null){
            st.push(root.left);
            root = root.left;
        }
    }
}