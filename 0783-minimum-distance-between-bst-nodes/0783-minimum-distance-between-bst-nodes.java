
class Solution {
    public int minDiffInBST(TreeNode root) {
        
         List<Integer> list = new ArrayList<>();
        
        inorder(root, list);
        
        
        int min = Integer.MAX_VALUE;
        
        for(int i=1; i<list.size(); i++){
            min = Math.min(min, (list.get(i) - list.get(i-1)));
        }
        
        return min;
    }
    
     public void inorder(TreeNode root, List<Integer> list){
        
        if(root == null) return;
        
        // inorder -> left, root, right
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        
    }
}