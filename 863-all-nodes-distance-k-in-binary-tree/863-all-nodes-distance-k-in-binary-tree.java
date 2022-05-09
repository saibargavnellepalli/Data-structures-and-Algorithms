/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        // 1) find parents
        HashMap<TreeNode,TreeNode> parentStore = new HashMap<>();
        parent(root,null,parentStore);
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //2) finding target
        findTarget(root,false,target,parentStore,ans,k);
        
        return ans;
    }
    
    private void parent(TreeNode currentNode, TreeNode parentNode,  HashMap<TreeNode,TreeNode> parentStore ){
        
        if(currentNode==null)
            return;
        parentStore.put(currentNode,parentNode);
        
        parent(currentNode.left,currentNode,parentStore);
        parent(currentNode.right,currentNode,parentStore);
        return;
    }
    
    private void findTarget(TreeNode root, boolean flag,TreeNode target, HashMap<TreeNode,TreeNode> parentStore,ArrayList<Integer>ans,int k){
        
        if(root == null)
            return;
        
        if(root == target){
             Set<Integer> set = new HashSet<Integer>();
            distanceKNode(root,k,parentStore,set,ans);
                flag = true;
            return;
        }
        if(!flag){
        findTarget(root.left, flag,target,parentStore,ans,k);
        findTarget(root.right, flag,target,parentStore,ans,k);
        }
        return;
    }
    //3) finding nodes of distance k
    
    private void distanceKNode(TreeNode root, int target,HashMap<TreeNode,TreeNode> parentStore,Set<Integer> visited,ArrayList<Integer>ans){
        
        if(root==null)
            return;
        
        if(visited.contains(root.val))
            return;
        
        if(target==0)
        {
            ans.add(root.val);
        }
        
     visited.add(root.val);
        
        distanceKNode(root.left,target-1,parentStore,visited,ans);                                  
        distanceKNode(root.right,target-1,parentStore,visited,ans);
        distanceKNode(parentStore.get(root),target-1,parentStore,visited,ans);
        
        return;
        
    }
    
    
}