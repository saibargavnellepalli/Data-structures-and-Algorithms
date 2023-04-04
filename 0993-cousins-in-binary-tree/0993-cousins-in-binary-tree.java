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
       
        ArrayList<Integer> arr = new ArrayList<>();
        
        f(root,0,arr,x,y);
        
       // System.out.println(arr[0]+" "+arr[1] +" "+arr[2] +" "+arr[3]);
        
        // 2,1
        
        if(arr.size() <4) return false;
        
        return arr.get(0) != arr.get(2)  && arr.get(1) == arr.get(3);
    }
    public void f(TreeNode root, int lvl,  ArrayList<Integer> arr ,int x, int y){
        
        if(root == null) return;
        
        if(root.left != null && (root.left.val == x  || root.left.val == y)){
       
           arr.add(root.val);
            arr.add(lvl);
            
        
    }
         if(root.right != null && (root.right.val == x  || root.right.val == y)){
       
            arr.add(root.val);
            arr.add(lvl);
        
    }
        
       
        
        f(root.left, lvl+1,arr,x,y);
        f(root.right,lvl+1,arr,x,y);
        
        return;
    }
}