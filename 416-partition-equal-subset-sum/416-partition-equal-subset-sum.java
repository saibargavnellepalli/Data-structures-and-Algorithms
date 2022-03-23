class Solution {
    public boolean canPartition(int[] nums) {
        
        int totalSum = 0;
        for(int elm : nums){
            totalSum+=elm;
        }
        
        //if sum is odd, then it can't be divided into 2 equal parts
        if(totalSum%2!=0)
            return false;
        
        //We can check if sum is even
        return checkSum(0,totalSum/2,nums,nums.length,new HashMap<String,Boolean>());
    }
    
    //ts --> target sum
    public boolean checkSum(int CI,int ts,int[] nums,int n, HashMap<String,Boolean> memo){
        
        if(ts == 0)
            return true;
        
        if(CI>=n)
            return false;
        
        
        String currentKey = Integer.toString(CI)+"-"+Integer.toString(ts);
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        //pick
        boolean pick = false;
        
        if(nums[CI]<=ts)
          pick = checkSum(CI+1,ts-nums[CI],nums,n,memo);
        
            if(pick){
            memo.put(currentKey,true);
            return true;
        }
        
       boolean notPick = checkSum(CI+1,ts,nums,n,memo);
        
        memo.put(currentKey, pick||notPick);
        
        return pick || notPick;
        
        
        
    }
}