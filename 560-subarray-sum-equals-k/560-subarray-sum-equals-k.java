class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0,n=nums.length;
        for(int i=0;i<n;i++){
           int ans =0;
            for(int j=i;j<n;j++){
                ans+=nums[j];
                if(ans == k){
                    c++;
                   // break;
                }
            }
        }
        return c;
    }
}