
class Solution {
    int ind=0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return constructTree(preorder, inorder, 0, preorder.length-1);
    }
    
    public TreeNode constructTree(int[] preorder, int[] inorder, int startInd, int endInd){
        
        if(ind >= preorder.length) return null;
        if(startInd > endInd) return null;
        
        
        int val = preorder[ind];
        TreeNode node = new TreeNode(val);
        ind++;
        
        int i=0;
        for(i=startInd; i<=endInd; i++){
            if(inorder[i] == val) break;
        }
        
        
        node.left = constructTree(preorder, inorder, startInd, i-1);
        node.right = constructTree(preorder, inorder, i+1, endInd);
        
        return node;
        
        
        
        
        
        
    }
}