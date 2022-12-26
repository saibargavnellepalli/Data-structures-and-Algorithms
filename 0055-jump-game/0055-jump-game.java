class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return isPossible(0,nums, dp);
    }
    public boolean isPossible(int CI, int[] nums, Boolean dp[]){
        
        if(CI==nums.length-1)
            return true;
        
        int currentKey = CI;
        if(dp[CI] !=  null)
            return dp[CI];
        
        int currentJump = nums[CI];
        boolean ans = false;
        
        
        
        for(int i=1;i<=currentJump;i++){
            boolean tempAns = isPossible(CI+i, nums,dp);
            if (tempAns){
                 dp[CI] = true;
                return true;}
            ans = ans || tempAns;
        }
        dp[CI] = ans;
        
        return ans;
        
    }
}