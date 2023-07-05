class Solution {
    public int longestSubarray(int[] nums) {
     
          // 0 1 2 3 4 5 6 7 8
        //   0 1 1 1 0 1 1 0 1
     int i=0;
     int ones = 0,ans=0;
     int n = nums.length;
     int zeros = 0;
     int start=0;
        
        while(i<n){
            if(nums[i] == 0){
                zeros++;
                if(zeros == 1){
                  start = i;   
                }
               
            }
            
            if(zeros == 2){
                ans = Math.max(ones,ans);
                ones  = i-start-1;
                zeros--;
                start = i;
            }
            
            if(nums[i] == 1){
                ones++;
            }
            
           // System.out.println(ones+" "+i);
            i++;
        }
        
       ans = Math.max(ones,ans);
        
        if(ones == n) return n-1;
        
        return ans;

        
    }
}