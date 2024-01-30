class Solution {
    public int rob(int[] nums) {
        
        Integer[] dp = new Integer[nums.length+1];
        
       return f(0, nums, dp);
        
    }
    
    public int f(int curInd, int[] nums, Integer[] dp){
        
        if(curInd >= nums.length) return 0;
        
        if(dp[curInd] != null) return dp[curInd];
        
        int rob = nums[curInd]+f(curInd+2, nums, dp);
        int not = f(curInd+1, nums, dp);
        
        
        return dp[curInd] = Math.max(rob,not);
        
    }
}