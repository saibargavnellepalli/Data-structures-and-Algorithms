class Solution {
    public int rob(int[] nums) {
       return maxMoney(0,nums,new HashMap<Integer,Integer>());
    }
    public int maxMoney(int CI, int nums[],HashMap<Integer,Integer> memo){
        if(CI>=nums.length) return 0;
        
        if(memo.containsKey(CI)){
            return memo.get(CI);
        }
        
      int rob = nums[CI]+maxMoney(CI+2,nums,memo);
      int notRob = maxMoney(CI+1,nums,memo);
        
        memo.put(CI,Math.max(rob,notRob));
        return Math.max(rob,notRob);
        
        
    }
}