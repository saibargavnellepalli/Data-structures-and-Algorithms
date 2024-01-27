
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBst(nums,0, nums.length-1);
    }
    
    public TreeNode constructBst(int nums[], int s, int e){
        if(s>e) return null;
        
        
        int mid = (s+e)/2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = constructBst(nums, s, mid-1);
        node.right = constructBst(nums, mid+1, e);;
        
        return node;
        
    }
}