class Solution {
     int ind=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        ind = postorder.length-1;
    
         return constructTree(postorder, inorder, 0, postorder.length-1);
    }
    
    public TreeNode constructTree(int[] postorder, int[] inorder, int startInd, int endInd){
        
        
        if(startInd > endInd) return null;
        
        
        int val = postorder[ind];
        TreeNode node = new TreeNode(val);
        ind--;
        
        int i=0;
        for(i=startInd; i<=endInd; i++){
            if(inorder[i] == val) break;
        }
        
        
        node.right = constructTree(postorder, inorder, i+1, endInd);
        node.left = constructTree(postorder, inorder, startInd, i-1);
       
        
        return node;
        
        
  }
}