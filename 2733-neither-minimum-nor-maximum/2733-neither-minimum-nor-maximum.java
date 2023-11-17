class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        //sort
        //return any element other than first and last element
        
        
        //edge case
        if(nums.length <= 2){
            return -1;
        }
        
        Arrays.sort(nums);
        
        int ans = nums[1];
        
        return ans;
    }
}