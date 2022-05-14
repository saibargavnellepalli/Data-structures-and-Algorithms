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
        
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode>   seen = new HashSet<>();
         List<Integer> ans = new ArrayList<>();
        
        int level =-1;
        q.add(target);
        
        while(!q.isEmpty()){
           
            level+= 1;
            
            int n = q.size();
            
            for (int i=0;i<n;i++){
                TreeNode temp = q.poll();
                
                if(seen.contains(temp))
                    continue;
                
              if(level == k)
                    ans.add(temp.val);
                
                if(temp.left != null)
                    q.add(temp.left);
                
                if(temp.right != null)
                    q.add(temp.right);
                
               if(parentsMap.get(temp) != null)
                   q.add(parentsMap.get(temp));
                   
                seen.add(temp);
                   }   
        
            
                   } 
        
        return ans;
    }
}