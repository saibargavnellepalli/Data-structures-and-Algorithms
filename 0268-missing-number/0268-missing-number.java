class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        
        //sorting 
        Arrays.sort(nums);
        
        //checking with the index
        
        for(int ind =0; ind < n; ind++){
            
            if( ind != nums[ind]){
                return ind;
            }
        }
        
        
        return n;
        
        
    }
}