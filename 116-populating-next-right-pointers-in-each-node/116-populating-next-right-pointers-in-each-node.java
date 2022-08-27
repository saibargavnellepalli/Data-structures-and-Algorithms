/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        
        if(root == null)
            return null;
        q.add(root);
        
      while(!q.isEmpty()){
            
            int x = 0;
             List<Node> Innerlist = new ArrayList<>();
            
            int n = q.size();
            while(x<n){
                
                Node temp = q.peek();
                Innerlist.add(temp);
                q.remove();
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);
                
                x++;
                
            }
        
          
            for(int i=0;i<Innerlist.size()-1;i++){
                
                Innerlist.get(i).next = Innerlist.get(i+1);
            }
        }
          return root;   
    }
}