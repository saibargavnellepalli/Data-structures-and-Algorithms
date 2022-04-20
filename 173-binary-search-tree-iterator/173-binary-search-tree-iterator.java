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
class BSTIterator {

   // public BSTIterator(TreeNode root) {
      private Stack<TreeNode> stack;
public BSTIterator(TreeNode root) {
    stack = new Stack<>();
    pushLeft(root);
}

public boolean hasNext() {
    return !stack.isEmpty();
}

private void pushLeft(TreeNode node) {
    while (node != null) {
        stack.push(node);
        node = node.left;
    }
}

public int next() {
    TreeNode node = stack.pop();
    pushLeft(node.right);
    return node.val;

}
}
