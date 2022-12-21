class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int acq=0, rel=0, n=nums.length, ones=0, ans = Integer.MIN_VALUE,zeros=0;
        
        while(acq<n && rel<n){
             
            if(nums[acq] == 1)
                ones += 1;
            else
                zeros += 1;
                
            //int remZeros = (acq-rel+1) - ones;
            
            if(zeros <= k){
                ans = Math.max(acq-rel + 1, ans);
            }
            else{
                while(zeros > k){
                 if(nums[rel] == 1)
                ones -= 1;
            else
                zeros -= 1;
                    
                    rel += 1;
                }
            }
            
            acq += 1;
        }
        
        return ans == Integer.MIN_VALUE ? 0 : ans;
    }
}