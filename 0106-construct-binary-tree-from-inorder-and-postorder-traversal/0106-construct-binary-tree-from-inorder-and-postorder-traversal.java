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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
         buildMap(map,inorder); 
        int arr[] = {postorder.length-1};
       return treeFun(0,inorder.length-1,inorder,postorder,map,arr);
    }
    
    public void buildMap(HashMap<Integer,Integer> map, int[] arr){
        
        for(int i=0;i<arr.length;i++)
            map.put(arr[i],i);
    }
    
    public TreeNode treeFun(int st, int end, int[] in, int[] post, HashMap<Integer,Integer> map, int[] arr){
        if(st > end || arr[0]<0) return null;
        
        int cur = post[arr[0]];
        arr[0]-=1;
        
        TreeNode node = new TreeNode(cur);
        node.right = treeFun(map.get(cur)+1,end,in,post,map,arr);
        node.left = treeFun(st,map.get(cur)-1,in,post,map,arr);
        
        return node;
    }
}