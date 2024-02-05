class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0, end = nums.length-1;
        
        while(low <= end){
            int mid = (low+end)/2;
            
             if(target < nums[mid]) end = mid-1;
            
            else if(target > nums[mid]) low = mid+1;
            
            else return mid;
        }
        
        return -1;
    }
}