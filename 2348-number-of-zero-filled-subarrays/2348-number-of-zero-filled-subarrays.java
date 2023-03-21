class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] == 0){
                int j = 1;
                
                while(i< nums.length && nums[i] == 0){
                    ans += j;
                    j++;
                    i++;
                }
            }
        }
        
        return ans;
    }
}