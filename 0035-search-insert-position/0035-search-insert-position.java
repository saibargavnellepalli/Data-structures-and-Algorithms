class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //binary search 
        int start=0, end=nums.length-1;
        int insertPos = 0;
        
        while(start <= end){
            
            int mid = (start+end)/2;
            
             insertPos =  mid;
            
            if(nums[mid] == target) return mid;
            
            else if(target > nums[mid]) {
                start = mid+1;
            }
            //left side
            else if(target < nums[mid]){
                end = mid-1;
            }
            
        }
        
        if(nums[insertPos] < target)  return insertPos+1;
        
        return insertPos;
            
            
        }
    
}