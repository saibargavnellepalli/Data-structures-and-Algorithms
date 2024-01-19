class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(q.isEmpty() == false){
            
            int n = q.size();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i=1; i<=n; i++){
                
                TreeNode temp = q.poll();
                
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
                
                list.add(temp.val);
            }
            ans.add(list);
        }
        
        
        
        return ans;
    }
}