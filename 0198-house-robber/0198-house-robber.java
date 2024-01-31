class Solution {
    public int rob(int[] nums) {
        
        Integer dp[] = new Integer[nums.length+1];
        
        return f(0, nums, dp);
    }
    
    public int f(int curH, int nums[], Integer dp[]){
        
        if(curH >= nums.length) return 0;
        
        
        if(dp[curH] != null) return dp[curH];
        
        int rob = nums[curH] + f(curH+2, nums, dp);
        int not = f(curH+1, nums, dp);
        
        
        return dp[curH] = Math.max(rob, not);
    }
}