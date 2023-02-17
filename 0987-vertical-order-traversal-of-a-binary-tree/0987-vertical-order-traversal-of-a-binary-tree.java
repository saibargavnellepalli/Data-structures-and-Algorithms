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
    int row,col;
    TreeNode node;
    pair(TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        
        Queue<pair> q = new LinkedList<>();
        
        q.add(new pair(root,0,0));
        
        while(!q.isEmpty()){
            pair t = q.remove();
            int row = t.row;
            int col = t.col;
            TreeNode node = t.node;
            
            if(!map.containsKey(col)){
                TreeMap<Integer,PriorityQueue<Integer>> inMap = new TreeMap<>();
               PriorityQueue<Integer> pq = new PriorityQueue<>();
                
                    pq.add(node.val);
                    inMap.put(row,pq);
                    map.put(col,inMap);   
            }
            else{
                Map<Integer,PriorityQueue<Integer>> inMap = map.get(col);
                
                if(inMap.containsKey(row)){
                    PriorityQueue<Integer> pq = inMap.get(row);
                    pq.add(node.val);
                    inMap.put(row,pq);
                }
                else{
                    PriorityQueue<Integer> pq = new PriorityQueue <>();
                    pq.add(node.val);
                    inMap.put(row,pq);
                }
            }
            
            if(node.left != null)
            q.add(new pair(node.left,row+1,col-1));
            
            if(node.right != null)
             q.add(new pair(node.right,row+1,col+1));   
           
        }
        
        
         List<List<Integer>> ans = new ArrayList<>();
        
        for(TreeMap<Integer,PriorityQueue<Integer>> ys : map.values()){
            ArrayList<Integer> li = new ArrayList<>();
            
            for( PriorityQueue<Integer> cur : ys.values()){
                while(!cur.isEmpty()){
                    li.add(cur.poll());
                }
            }
            ans.add(li);
            
        }
        
        return ans;
        
    }
}