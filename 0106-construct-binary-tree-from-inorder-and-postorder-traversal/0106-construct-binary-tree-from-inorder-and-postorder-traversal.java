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
    HashMap<Integer,Integer> store = new HashMap<>();
        
        buildMap(store,inorder);
        int ind[] = {inorder.length-1};
        
        return construct(ind,0,inorder.length-1,postorder,inorder,store);
       
    }
    
     public void buildMap(HashMap<Integer,Integer> map, int[] nums){
            int i=0;
            for(int cur : nums){
                map.put(cur,i);
                i++;
            }
        }
    
    public TreeNode construct(int[] arr, int s, int e, int[] p, int[] i, HashMap<Integer,Integer> map){
        
        if(arr[0] >= i.length || s>e) return null;
        
        int cur = p[arr[0]];
        arr[0] -= 1;
        
        TreeNode root = new TreeNode(cur);
        int ind = map.get(cur);
        
        root.right = construct(arr,ind+1,e,p,i,map);
        root.left = construct(arr,s,ind-1,p,i,map);
        
        
        return root;
        
    }
}