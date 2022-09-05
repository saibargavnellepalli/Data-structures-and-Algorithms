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
        
      while(q.isEmpty()==false){
         
          
          int n = q.size();
          List<Integer> al = new ArrayList<>();
          int i=0;
          while(i<n){
               Node temp = q.remove();
              al.add(temp.val);
              for(Node curChild : temp.children){
                  q.add(curChild);
              }
              i++;
          }
          list.add(al);
      }
        }
    }
