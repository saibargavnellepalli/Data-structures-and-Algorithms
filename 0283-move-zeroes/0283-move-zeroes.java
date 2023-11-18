class Solution {
    public void moveZeroes(int[] nums) {
       
        int i=0;
        int n = nums.length;
        
        int newArray[] = new int[n];
        
        for(int j=0;j<n;j++){
          
            if(nums[j] != 0){
                newArray[i] = nums[j];
                i++;
            }
        }
        
        for(int k=i;k<n;k++){
            newArray[k] = 0;
        }
        
        
        
        for(i=0;i<n;i++){
            nums[i] = newArray[i];
        }
        
    }
}