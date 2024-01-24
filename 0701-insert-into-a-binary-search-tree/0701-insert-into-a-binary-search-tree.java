
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode ans = root;
        
        while(root != null){
            
            if(val < root.val){
                
                if(root.left == null){
                    TreeNode newNode = new TreeNode(val);
                    root.left = newNode;
                    
                    return ans;
                }
                
                root = root.left;
            }
            else if(val > root.val){
                
                if(root.right == null){
                    TreeNode newNode = new TreeNode(val);
                    root.right = newNode;
                    
                    return ans;
                }
                
                root = root.right;
            }
            
        }
        
        return new TreeNode(val);
        
    }
}