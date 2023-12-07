class Solution {
    public int[] twoSum(int[] nums, int k) {
       //2+7 = 9
    //   0 1 
        
        // [3,2,4]  6
        
        //    1,2
        
        int answerArray[] = {-1,-1};
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            int a = nums[i];
            
        
            for(int j=i+1;j<n;j++){
                int b = nums[j];
                
                if(a + b == k ){
                    
                    answerArray[0] = i;
                    answerArray[1] = j;
                    
                }
            }
            
        }
        
        return answerArray;
    }
}