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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
     
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        List<Integer> ans = new ArrayList<>();
        
        inorder(root1, list1);
        
        inorder(root2, list2);
        
        int i=0, j=0;
        
        while(i<list1.size() && j<list2.size()){
            
            if(list1.get(i) <= list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }
            else{
                ans.add(list2.get(j));
                j++;
            }
        }
        
        while(i<list1.size()) ans.add(list1.get(i++));
        
        while(j<list2.size()) ans.add(list2.get(j++));
        
        return ans;
        
        
        
        
        
        
    }
    
    public void inorder(TreeNode root, List<Integer> list){
        
        if(root == null) return;
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        
    }
}