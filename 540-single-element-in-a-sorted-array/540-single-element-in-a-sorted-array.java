class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        
        if(n==1) return nums[0];
        if(n==2) return nums[0];
        
        int i=0;
        while(i<n-1){
            if(nums[i]==nums[i+1]) i=i+2;
            else return nums[i];
        }
        
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        
        return nums[0];
        
    }
}