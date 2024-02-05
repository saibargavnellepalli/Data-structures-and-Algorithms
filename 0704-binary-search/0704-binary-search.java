class Solution {
    public int search(int[] nums, int target) {
        
       int start=0, end=nums.length-1;
        
        while(start <= end){
        int mid = (start+end)/2;
        
        //search  right side
        if(target > nums[mid]){
            start = mid+1;
        }
        //search left side
        else if(target < nums[mid]){
            end = mid-1;
        }
        else{
            return mid;
        }
            
    }
        
        return -1;
        
    }
}