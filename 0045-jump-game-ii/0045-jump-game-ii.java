class Solution {
    public int jump(int[] nums) {
        
        return minJumps(nums,0,new HashMap<Integer,Integer>());
    }
    
    public int minJumps(int[] nums, int CI, HashMap<Integer,Integer> memo){
        
        if(CI>=nums.length-1)
            return 0;
        
        if(nums[CI] == 0)
            return 10001;
        
        int currentKey = CI;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int ans = 10001;
        int currentJumps = nums[CI];
        
        for(int i=1;i<=currentJumps;i++){
            int temp =1+ minJumps(nums,CI+i,memo );
            ans = Math.min(temp,ans);
        }
        memo.put(CI, ans);
        return ans;
    }
}