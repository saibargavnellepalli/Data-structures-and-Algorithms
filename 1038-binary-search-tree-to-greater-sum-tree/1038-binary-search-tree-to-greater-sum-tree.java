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
    public TreeNode bstToGst(TreeNode root) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int count[] = new int[2];
        count[0] =0;
        
        sum(arr);
        count[1] = arr.size()-1;
        for(int e : arr)
            System.out.print(e+" ");
        gst(root,arr,count);
        
        return root;
        
    }
    
    //convert bst to gst
    private void gst(TreeNode root,ArrayList<Integer> arr,int[] count){
        
        if(root == null)
            return;
        gst(root.left,arr,count);
        if(count[0] == 0)
            root.val=arr.get(count[1]);
        else
            root.val = arr.get(count[1]) - arr.get(count[0]-1);
        count[0] +=1;
            
        gst(root.right,arr,count);
    }
    
    //cal prefix sum
    private void sum(  ArrayList<Integer> arr){
        for(int i=1;i<arr.size();i++)
            arr.set(i,arr.get(i)+ arr.get(i-1)) ;
    }
    
   
    
    //gives sorted array
    private void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null)
            return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        
    }
}