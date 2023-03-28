class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer dp[][] = new Integer[nums.length][nums.length+1];
        
        return f(0,nums,-1,dp);
    }
    
    public int f(int i, int nums[], int prev,Integer dp[][]){
        
        if(i==nums.length) return 0;
        
        
        if(prev != -1 && dp[i][prev] != null) return dp[i][prev];
        
        int pick=0,notpick=0;
        
        
        if(prev==-1 || nums[i] > nums[prev]){
            pick = 1+f(i+1,nums,i,dp);
        }
       
            notpick = 0+f(i+1,nums,prev,dp);
        
        if(prev != -1){
            dp[i][prev]=Math.max(pick,notpick);
        }
        return Math.max(pick,notpick);
    }
}