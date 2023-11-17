class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        for(int i=0;i<n;i++){
           boolean res = isPresent(i,nums);    
            
            if(res == false){
                return i;
            }
        }
        
        return n;
    }
    
    
    public static boolean isPresent(int element, int nums[]){
       
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] == element){
                return true;
            }
        }
        
        return false;
    }
}