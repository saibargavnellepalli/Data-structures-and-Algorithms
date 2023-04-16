class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int first=0,second=0;
        int n = nums.length,ans=10000000,sum=0;
        
        while(first < n){
            sum += nums[first];
            
           
            while(second<n && sum >= target){
                 ans = Math.min(ans,first-second+1);
                sum-=nums[second];
                second++;
            }
            first++;
        }
        
        return ans==10000000?0:ans;
    }
}