/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class pair{
    TreeNode node;
    int x;
    pair(TreeNode node, int x){
        this.node = node;
        this.x = x;
    }
}
class Solution {
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
     
        //Finding parents
        HashMap<TreeNode,TreeNode> parentsMap = new HashMap<>();
        
        findParents(root,parentsMap);
        
       return findNodes(target,k, parentsMap);
    }
    
    private void findParents(TreeNode root,  HashMap<TreeNode,TreeNode> parentsMap ){
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root!=null)
            q.add(root);
        
        while(!q.isEmpty()){
            
            TreeNode temp = q.poll();
            
            if(temp.left!=null){
                parentsMap.put(temp.left,temp);
                q.add(temp.left);
            }
            
            if(temp.right!=null){
                parentsMap.put(temp.right,temp);
                q.add(temp.right);
            }
            
        }
    }
    
    private List<Integer> findNodes(TreeNode target,int k, HashMap<TreeNode,TreeNode> parentsMap){
        
        Queue<pair> q = new LinkedList<>();
        Set<TreeNode>   seen = new HashSet<>();
         List<Integer> ans = new ArrayList<>();
        
        
        
        q.add(new pair(target,k));
        
        while(!q.isEmpty()){
            
            pair temp = q.poll();
            TreeNode currentNode = temp.node;
             k = temp.x;
            
            if(seen.contains(currentNode))
                continue;
            
            if(k == 0){
                ans.add(currentNode.val);
                continue;
            }
            
            if(currentNode.left != null)
                q.add(new pair(currentNode.left,k-1));
            
            if(currentNode.right != null)
                q.add(new pair(currentNode.right, k-1));
            
            if(parentsMap.get(currentNode) != null)
                q.add(new pair(parentsMap.get(currentNode), k-1));
            
            seen.add(currentNode);
            
            
        }
        return ans;
    }
}