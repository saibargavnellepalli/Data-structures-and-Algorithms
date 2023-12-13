class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     
        int ones=0;
        int ans = 0;
        
        for(int i=0;i<nums.length;i++){
            
            int cur = nums[i];
            
            
            // cur -> 1 or cur -> 0
            
            if(cur == 1){
                ones++;
            }
            else{
                if(ones > ans){
                    ans = ones;
                }
                ones = 0;
            }
        }
        
        
        if(ones > ans){
                    ans = ones;
                }
        
        return ans;
    }
}