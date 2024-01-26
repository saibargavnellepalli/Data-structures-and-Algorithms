
class Solution {
    int ind=0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        
        return constructTree(preorder, inorder, 0, preorder.length-1, map);
    }
    
    public TreeNode constructTree(int[] preorder, int[] inorder, int startInd, int endInd, HashMap<Integer,Integer> map){
        
        
        if(startInd > endInd) return null;
        
        
        int val = preorder[ind];
        TreeNode node = new TreeNode(val);
        ind++;
        
        int i=map.get(val);
       
        
        
        
        node.left = constructTree(preorder, inorder, startInd, i-1, map);
        node.right = constructTree(preorder, inorder, i+1, endInd,map);
        
        return node;
        
        
  }
}