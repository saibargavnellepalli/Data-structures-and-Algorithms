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
    public int findSecondMinimumValue(TreeNode root) {
         Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        ArrayList<Integer> values = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode current = q.pop();
            values.add(current.val);
            if(current.left != null)
                q.add(current.left);
            if(current.right != null)
                q.add(current.right);
        }
        Collections.sort(values);
        //ArrayList<Integer> min = new ArrayList<>();
        
        int first = values.get(0);
        int i=0;
        
        while(i<values.size() && values.get(i) == first){
            i++;
        }
        
        if(i == values.size()) return -1;
        
        return values.get(i);
    }
}