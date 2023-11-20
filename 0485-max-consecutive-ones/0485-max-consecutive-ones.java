class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int ones = 0, ans = 0;
        
        int i=0;
       
        int n = nums.length;
        
        for(int j=0;j<n;j++){
            if(nums[j] == 1){
                ones++;
                 
            }   
            else {
               ans = Math.max(ones,ans);
                ones = 0;
            }
        }
        ans = Math.max(ones,ans);
        
        return ans;
    }
}