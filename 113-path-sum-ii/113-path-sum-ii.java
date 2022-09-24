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
    int i=0;
    public List<List<Integer>> pathSum(TreeNode root, int k) {
       List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        f(root,k,list,ans,0);
        return ans;
    }
    private void f(TreeNode root, int k,List<Integer> list, List<List<Integer>> ans,int sum){
        if(root == null)
            return;
           //System.out.println(sum+root.val);
        
       
        list.add(root.val);
        
        if(root.left == null && root.right == null && sum+root.val == k){
         
           ans.add(new ArrayList<Integer>(list));
        }
         //sum+=root.val;
        
        f(root.left,k,list,ans,sum+root.val);
        ///sum+=root.val;
         f(root.right,k,list,ans,sum+root.val);
        list.remove(list.size()-1);
        return;
            
    }
}