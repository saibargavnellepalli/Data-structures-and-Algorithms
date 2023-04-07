class Solution {
    public void nextPermutation(int[] nums) {
        
        
        int ind = dip(nums);
        
        if(ind != -1)
            nextSmallest(ind,nums);
        
        
        
       // System.out.println(ind);
        
        reverse(ind+1,nums);
            
        
    }
    
    
    public int dip(int[] nums){
        
        int dipInd = -1;
        int n = nums.length;
        
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1])
                return i;
        }
        
        return -1;
    }
    
    
    public void nextSmallest(int ind, int[] nums){
        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] > nums[ind]){
                int t = nums[i];
                nums[i] = nums[ind];
                nums[ind] = t;
                return;
            }
        }
    }
    
    public void reverse(int ind, int nums[]){
        
        int i=ind,j=nums.length-1;
        
        while(i<=j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}