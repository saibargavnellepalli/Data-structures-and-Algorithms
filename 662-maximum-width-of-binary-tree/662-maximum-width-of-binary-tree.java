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
class pair{
    TreeNode node;
    int num;
    pair(TreeNode node, int num){
        this.node = node;
        this.num = num;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        //queue for bfs
        Queue<pair> q = new LinkedList<>();
        
         q.add(new pair(root,0));
        
        int ans = Integer.MIN_VALUE;
        //perform bfs
        while(!q.isEmpty()){
            
            int n = q.size();
            int min = q.peek().num;
            int f =0,s=0;
            //processing each level
            for(int i=0;i<n;i++){
                
                pair cc= q.remove();
                TreeNode currNode = cc.node;
                
                int id = cc.num-min;
                
                if(i==0) f = id;
                if(i==n-1) s = id;
                if(currNode.left != null){
                    q.add(new pair(currNode.left,2*id+1));
                }
                
                if(currNode.right != null){
                    q.add(new pair(currNode.right,2*id+2));
                }
               
                    
            }
            
            
            ans = Math.max(ans,s-f+1);
        }
        return ans;
    }
}