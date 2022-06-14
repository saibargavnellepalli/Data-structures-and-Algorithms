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
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        ArrayList<TreeNode> al1 = new ArrayList<>(); 
        ArrayList<TreeNode> al2 = new ArrayList<>();
        preOrder(root,al1);
        preOrder(subRoot,al2);
        
        // System.out.println(al1);
       //  System.out.println(al2);
        return check(al1,al2);
    }
    
    private void preOrder(TreeNode root, ArrayList<TreeNode> al){
       if(root == null){
           al.add(null);
           return;
       }
        al.add(root);
        preOrder(root.left,al);
        preOrder(root.right,al);
        
        return;
    }
    
    private boolean check(ArrayList<TreeNode> al1, ArrayList<TreeNode> al2){
        int j=0;
        for(int i=0;i<al1.size();i++){
            
            
            
                if(al1.get(i) != null && al1.get(i).val == al2.get(j).val){
                    int a=i,b=0,ans=0;
                    while(b<al2.size()){
                          if(al1.get(a) != null && al2.get(b) != null && al1.get(a).val == al2.get(b).val)
                            ans += 1; 
                        
                    
                    else if(al1.get(a) == null && al2.get(b) == null)
                        ans +=1;
                    else
                        break;
                        
                      a+=1; b+=1;  
                }
                    System.out.println(ans +" "+al2.size());
        
                    if(ans == al2.size())
                        return true;
            }
        
    }
        
        
        return false;
    
    
} 
}