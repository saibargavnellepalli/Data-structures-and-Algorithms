class Solution {
    public int combinationSum4(int[] nums, int target) {
        
      return combinationSum(nums,target, new HashMap<Integer,Integer>());
        
    }
    public int combinationSum(int[] nums, int target, HashMap<Integer,Integer> map) {
      if(target == 0)
            return 1;
        
        if(map.containsKey(target))
            return map.get(target);
        if(target < 0)
            return 0;
        
        
      else{
          int ways = 0;
        for(int i=0;i<nums.length;i++){
            ways += combinationSum(nums,target-nums[i],map);
        }
          map.put(target,ways);
          return ways;
          
      }
          
}
}