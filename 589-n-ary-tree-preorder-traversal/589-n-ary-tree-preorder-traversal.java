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
    public List<Integer> preorder(Node root) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        preOrderTraversal(root, al);
        return al;
        
    }
    public void preOrderTraversal(Node root, ArrayList<Integer>al){
        if(root == null)
            return;
        
        al.add(root.val);
        
        List<Node> childrens = root.children;
        
        for(Node curr : childrens){
            preOrderTraversal(curr, al);
        }
        
    }
}