class Solution {
    public int removeDuplicates(int[] nums) {
        
        // 0 0 0 0 1 2 3
        
        // 0 1 2 3 - - -
        
        
            int i =0;
            int n = nums.length;
        
            for(int j=0;j<n;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i+1;
    }
}