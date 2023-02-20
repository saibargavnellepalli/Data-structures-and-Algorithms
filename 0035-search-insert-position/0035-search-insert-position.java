class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        
        int st=0,end=nums.length-1;
      
        while(st<=end){
            int mid = (st+end)/2;
            System.out.println(st+" "+mid+" "+end);
            ans = mid;
            
            if(nums[mid]==target) return mid;
            
            else if(nums[mid] < target){
                st = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        
        if(nums[ans] < target) return ans+1;
        
        
        return ans;
    }
}