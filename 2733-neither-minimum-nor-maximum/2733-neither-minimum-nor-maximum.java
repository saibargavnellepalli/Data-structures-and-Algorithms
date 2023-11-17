class Solution {
    public int findNonMinOrMax(int[] nums) {
       
        
       int minElm = nums[0];
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i] < minElm){
                minElm = nums[i];
            }    
        }
        
        int maxElm = nums[0];
        for(int i=0;i<n;i++){
            if(nums[i] > maxElm){
                maxElm = nums[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(nums[i] != minElm && nums[i] != maxElm){
                return nums[i];
            }
        }
        
        
    return -1;
    }
}