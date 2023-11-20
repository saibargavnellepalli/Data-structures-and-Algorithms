class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        
        //upper pointer/variable
        
        int i=0;
        
    
        //lower pointer 
        for(int j=0;j<n;j++){
            
            //differet elements
            
            if(nums [i]  != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i+1;
        
        
    }
}