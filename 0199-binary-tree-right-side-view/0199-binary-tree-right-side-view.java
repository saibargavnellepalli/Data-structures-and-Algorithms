class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        f(0, root, list);
        
        return list;
        
    }
    
    public void f(int l, TreeNode root, List<Integer> list){
        
        if(root == null) return;
        
        
        if(l >= list.size()){
        list.add(root.val);
    }
        
        f(l+1, root.right, list);
        f(l+1, root.left, list);
        
        return;
        
        
    }
}