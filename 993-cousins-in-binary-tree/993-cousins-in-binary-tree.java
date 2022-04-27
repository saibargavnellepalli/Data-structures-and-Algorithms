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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        if(root.val == x || root.val == y)
            return false;
        
      ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        cousin(root,x,y,1,list);
        
        if(list.size()<4){
            return false;
        }
        
        if(list.get(0)==list.get(2) && list.get(1)!=list.get(3))
            return true;
        
        return false;
        
    }
    
    public void cousin(TreeNode root, int x, int y,   int count, ArrayList<Integer> list){
        
        if(root == null)
            return;
        
        if(root.left !=null){
        if(root.left.val == x || root.left.val == y ){
            list.add(count);
            list.add(root.val);
            return;
        }
        }
        
        if(root.right!=null){
        if(root.right.val == x || root.right.val == y) {
             list.add(count);
             list.add(root.val);
            return;
        }
        }
        
        
         cousin(root.left,x,y,count+1,list);
         cousin(root.right,x,y,count+1,list);
        return;
    }
}
