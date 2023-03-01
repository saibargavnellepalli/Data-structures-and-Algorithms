
class BSTIterator {
TreeNode root;
    Stack<TreeNode> st = new Stack<>();
    public BSTIterator(TreeNode root) {
        root = root;
        helper(root);
    }
    
    public int next() {
       
        
            
            TreeNode t = st.pop();
           if(t.right != null){
               helper(t.right);
           }
            return t.val;
            
        
        
        
        
        
    }
    
    public boolean hasNext() {
       return !st.isEmpty();
    }
    
    public void helper(TreeNode root){
        while(root != null){
            st.push(root);
            root = root.left;
        }
    }
}

