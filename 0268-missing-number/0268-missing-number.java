class Solution {
    public int missingNumber(int[] nums) {
        
         
            int n = nums.length;
            for(int i=0; i<n ;i++){
                
              boolean ans  = isPresent(i, nums);
                
                if(ans == false){
                    return i;
                }
                
            }
        
        
       return n;     
    }
    
     public static boolean isPresent(int key, int nums[]){
        
        int n = nums.length;
        
        for(int i=0; i<n;i++){
            
            if(nums[i]  == key ){
                return true;
            }
        }
        
        return false;
        
    }
}