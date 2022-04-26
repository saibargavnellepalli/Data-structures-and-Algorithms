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
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        Stack<Node> stack = new Stack<>();
        
           if(root==null)
               return ans;
         
            stack.push(root);
        
        while(!stack.isEmpty()){
            
           Node currNode = stack.peek();
            
            List<Node> child = currNode.children;
            ans.add(currNode.val);
            stack.pop();
            
            for(int i=child.size()-1; i>=0 ;i--){
                stack.push(child.get(i));
            }
        }
        return ans;
        
    }
}