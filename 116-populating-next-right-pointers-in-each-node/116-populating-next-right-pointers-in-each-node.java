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
      if(root == null) return root;    
      helper(root.left, root.right);
      return root;
    }
    
    void helper(Node node1, Node node2){
      if(node1 == null) return;    
      node1.next = node2;
      helper(node1.left, node1.right);
      helper(node2.left, node2.right);
      helper(node1.right, node2.left);
    }
}