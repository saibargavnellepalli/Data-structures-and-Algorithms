/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        //Queues D.S for Level order traversal
        Queue<Node> q = new LinkedList<>();
        if(root==null)
            return list;
        
        q.add(root);
        
        //level order traversal function
        lvlOrder(root,q,list);
        
        return list;
        
    }
    
    private void lvlOrder(Node root, Queue<Node> q, List<List<Integer>> list){
        
        while(!q.isEmpty()){
            
            //add current level elements to list
            int i=0;
            int n = q.size();
            List<Integer> ans = new ArrayList<>();
            while(i<n){
                Node temp = q.poll();
                ans.add(temp.val);   
                //to get nodes
                for(Node currentChild : temp.children){
                  
                    q.add(currentChild);
                   
                }
                 i+=1;
            }
            list.add(ans);
        }
    }
}