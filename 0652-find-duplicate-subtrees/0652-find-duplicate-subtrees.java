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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> li = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        
       String t= f(root,map,li);
        return li;
    }
    
    public String f(TreeNode root,  HashMap<String,Integer> map, List<TreeNode> ans){
        if(root == null) return "#";
        
        String left = f(root.left,map,ans);
        String right = f(root.right, map,ans);
        
        String cur = left+"-"+right+"-"+root.val;
        
        if(map.containsKey(cur)){
            if(map.get(cur)==1)
            ans.add(root);
            map.put(cur,map.get(cur)+1);
        }
        else{
            map.put(cur,1);
        }
        
        return cur;
    }
}