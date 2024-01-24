
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        
        boolean ans = f(root, k, set);
        
        return ans;
    }
    public boolean f(TreeNode root, int k, HashSet<Integer> set){
        
        if(root == null) return false;
        
        if(set.contains(k-root.val)) return true;
        
        set.add(root.val);
        
        boolean left = f(root.left, k, set);
       boolean right =  f(root.right, k, set);
        
        return left || right;
        
        
    }
}