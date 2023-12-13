class Solution {
    public int longestOnes(int[] nums, int k) {
        
        
        // [1,1,1,0,0,0,1,1,1,1,0],
        
        int one=0, zero=0, ans=0;
        
        int acq=0, rel=0;
        
        
        for(acq=0; acq<nums.length; acq++){
            
            int cur = nums[acq];
            
            if(cur == 1) one++;
            if(cur == 0) zero++;
            
            //valid case
            if ( zero <= k){
                ans = Math.max(acq-rel+1, ans);
            }
            //invalid case
            else{
                
                
                while(zero > k){
                    if(nums[rel] == 1) one--;
                    if(nums[rel] == 0) zero--;
                    
                    rel++;
                }
            }
            
            
            
            
        }
        
        return ans;
        
    }
}