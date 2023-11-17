class Solution {
    public int findNonMinOrMax(int[] nums) {
        
   /*     //sort -> n*logn
        //return any element other than first and last element
        
        
        //edge case
        if(nums.length <= 2){
            return -1;
        }
        
        Arrays.sort(nums);
        
        int ans = nums[1];
        
        return ans;
        */
        
        //min
        //max
        //find elem which is not min and not max
        
        //edge case
        if(nums.length <= 2) return -1;
        
        int n = nums.length;
        
        int min = nums[0];
        
        
        // 1) find min
        for(int i=0;i<n;i++){
            if(nums[i] < min){
                //update the min
                min = nums[i];
            }
        }
        
        
    // 2) max
        int max = nums[0];
        
         for(int i=0;i<n;i++){
            if(nums[i] > max){
                //update the max
                max = nums[i];
            }
        }
        
        //3
        for(int i=0;i<n;i++){
            if(nums[i] != min && nums[i] != max){
                return nums[i];
            }
        }
        
        
        return -1;
        
        
    }
}