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
    public List<Integer> rightSideView(TreeNode root) {
        

        
    ArrayList<Integer> list = new ArrayList<Integer>();
   
    Queue<TreeNode> q = new LinkedList<>();
        
        if(root!=null){
            q.add(root);
                 list.add(root.val);
        }
        
        //perform BFS
        while(!q.isEmpty()){
             int n = q.size();
             int elm = 0;
            //process each level
            for(int i=0;i<n;i++){
                TreeNode t = q.remove();
                if(t.left!=null){
                    q.add(t.left);
                    elm = t.left.val;
                }
                if(t.right!=null){
                    q.add(t.right);
                    elm = t.right.val;
                }
            }
            if(elm!=0)
            list.add(elm);
        }
        
        return list;
        
    }
}