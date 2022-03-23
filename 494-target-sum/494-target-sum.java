class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums,target,0);
    }
    
    public int ways(int[] nums,int target, int CI){
        
        
        if(CI>=nums.length && target==0) return 1;
         if(CI>=nums.length && target!=0) return 0;
        
       // if(target==0) return 1;
        
        int plus = ways(nums,target-nums[CI],CI+1);
        int minus = ways(nums,target+nums[CI],CI+1);
        
        return plus+minus;
    }
}