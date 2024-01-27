
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }
    private TreeNode buildTree(int nums[],int s,int e){
       
        if(s>e) return null;
        
        
        int mid = (s+e)/2;
        
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left= buildTree(nums, s, mid-1);
        node.right = buildTree(nums,mid+1, e);
        
        return node;
        
        
}
}