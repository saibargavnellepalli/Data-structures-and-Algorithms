
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int[] preInd = {0};
        return f(preorder, inorder, preInd, 0, inorder.length-1);
        
    }
    
    public TreeNode f(int[] preorder, int[] inorder, int[] preInd, int startInd, int endInd){
           
        if(preInd[0] >= preorder.length || startInd > endInd){
            return null;
        }
        
        
        int curVal = preorder[preInd[0]];
        TreeNode root = new TreeNode(curVal);
        preInd[0]+=1;
        
        int i=-1;
        
        for( i=startInd; i<=endInd; i++){
            if(inorder[i] == curVal) break;
        }
        
        root.left = f(preorder, inorder, preInd, startInd, i-1);
        root.right = f(preorder, inorder, preInd, i+1, endInd);
        
        return root;
        
        
        
        
        
    }
}