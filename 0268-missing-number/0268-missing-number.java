class Solution {
    public int missingNumber(int[] nums) {
     int sum = 0;
        int n = nums.length;
        int cur = 0;
        for(int i=0;i<=n;i++){
            if(i<=n-1)
            sum += nums[i];
            cur += i;
        }
        
        return cur-sum;
    }
}