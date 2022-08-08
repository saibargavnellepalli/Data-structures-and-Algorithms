class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer[][] dp = new Integer[nums.length][nums.length+1];
        return f(0,-1,nums,dp);
    }
    
    private int f(int ind, int prevInd, int[] nums,Integer [][] dp){
        
        if(ind == nums.length)
            return 0;
        
        if(dp[ind][prevInd+1] != null)
            return dp[ind][prevInd+1];
        
        int len = 0 + f(ind+1, prevInd, nums,dp);
        
        if(prevInd == -1 || nums[ind]>nums[prevInd]){
            
            len = Math.max(len, 1 + f(ind +1, ind, nums, dp));
        }
        return dp[ind][prevInd+1]=len;
    }
}