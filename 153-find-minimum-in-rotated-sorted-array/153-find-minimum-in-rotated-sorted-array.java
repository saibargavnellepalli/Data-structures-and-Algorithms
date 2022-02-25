class Solution {
    public int findMin(int[] nums) {
        
       
   int n = nums.length;
       
         int min=nums[0];
         if(n==1) return min;
        if(n==2) return Math.min(min,nums[1]);
      int start =0,end=n-1;
        while(start<end){
            int mid = (start+end)/2;
            if(mid>0 && nums[mid]<nums[mid-1]) return nums[mid];
            else if(nums[end]<nums[mid] && nums[start]>nums[end]) 
                start = mid+1;
            else end = mid-1;
        }
        return nums[start];
    }
}