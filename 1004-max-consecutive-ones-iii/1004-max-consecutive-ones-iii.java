class Solution {
    public int longestOnes(int[] nums, int k) {
        
        
        int acq=0, rel=0, ans=0;
        
        int ones=0, zeros=0;
        
        for(acq=0; acq<nums.length; acq++){
            
            int cur = nums[acq];
            
            if(cur == 1) ones++;
            else zeros++;
            
            if(zeros <= k){
                ans = Math.max(acq-rel+1, ans);
            }
            else{
                
                while(zeros > k){
                    
                    if(nums[rel] == 1) ones--;
                    if(nums[rel]  == 0) zeros--;
                    
                    rel++;
                }
            }
            
            
            
                
        }
        
        return ans;
    }
}