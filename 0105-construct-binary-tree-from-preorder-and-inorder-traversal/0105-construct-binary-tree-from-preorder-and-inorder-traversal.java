
class Solution {
     HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int[] preInd = {0};
        
       
        for(int i=0;i<inorder.length;i++)
        map.put(inorder[i], i);
        
        return f(preorder, inorder, preInd, 0, inorder.length-1);
        
    }
    
    
    
    public TreeNode f(int[] preorder, int[] inorder, int[] preInd, int startInd, int endInd){
           
        if(preInd[0] >= preorder.length || startInd > endInd){
            return null;
        }
        
        
        int curVal = preorder[preInd[0]];
        TreeNode root = new TreeNode(curVal);
        preInd[0]+=1;
        
        
        
        root.left = f(preorder, inorder, preInd, startInd, map.get(curVal)-1);
        root.right = f(preorder, inorder, preInd, map.get(curVal)+1, endInd);
        
        return root;
        
        
        
        
        
    }
}