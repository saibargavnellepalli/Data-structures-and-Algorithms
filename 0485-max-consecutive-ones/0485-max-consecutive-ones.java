class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        
        /*
        
        nums[] = [1,1,1,1,1,1,1] -> 7
        
        
        nums[] = [1,1,1,0,1,1,1,1,1,0];
        
        TotalConsOnes = 5
        
        ans = 5
        
        
        
        take two variables -> TotalConsOnes,ans
        
        read all the elements from array
                -> cur -> 1 -> increment the count of TotalConsOnes
                -> cur -> 0 -> update the ans, make the TotalConsOnes = 0;
        */
        
        
        int TotalConsOnes=0, ans=0;
        
        for(int i=0;i<nums.length;i++){
            int cur = nums[i];
            
            if(cur == 1){
                TotalConsOnes++;
            }
            else{
                ans = Math.max(TotalConsOnes,ans);
                TotalConsOnes = 0;
            }
        }
        
         ans = Math.max(TotalConsOnes,ans);
        
        return ans;
        
    }
}