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
class BSTIterator {
    Stack<TreeNode> st = new Stack<>();
    public BSTIterator(TreeNode root) {
        addLeft(root,st);
    }
    
    public int next() {
       TreeNode a =  st.pop();
        if(a.right!=null)
            addLeft(a.right,st);
        return a.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    private void addLeft(TreeNode root, Stack<TreeNode> st){
        st.push(root);
        while(root.left!=null){
            st.push(root.left);
            root=root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */