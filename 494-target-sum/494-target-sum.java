class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums,target,0,new HashMap<String,Integer>());
    }
    
    public int ways(int[] nums,int target, int CI,HashMap<String,Integer> memo){
        
        
        if(CI>=nums.length && target==0) return 1;
         if(CI>=nums.length && target!=0) return 0;
        
        String currentKey = Integer.toString(target) +"-"+Integer.toString(CI);
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int plus = ways(nums,target-nums[CI],CI+1,memo);
        int minus = ways(nums,target+nums[CI],CI+1,memo);
        
        memo.put(Integer.toString(target) +"-"+Integer.toString(CI),plus+minus);
        
        return plus+minus;
    }
}