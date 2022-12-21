class Solution {
    public int longestSubarray(int[] nums) {
        
        int acq=0, rel=0, n=nums.length,ones=0, zeros=0,ans=-100000000;
        
        while(acq<n && rel<n){
            if(nums[acq] == 1)
                ones += 1;
            else
                zeros += 1;
            
            if(zeros <= 1){
                ans = Math.max(acq-rel, ans);
            }
            else{
                while(zeros > 1){
                     if(nums[rel] == 1)
                ones -= 1;
            else
                zeros -= 1;
                      rel += 1;
                }
                
              
            }
            
            acq += 1;
        }
        
        return ans;
    }
}