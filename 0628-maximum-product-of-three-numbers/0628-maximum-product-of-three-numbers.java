class Solution {
    public int maximumProduct(int[] nums) {
        
        
        // we have to find the 3 largest elements
        
        // sorting
        
        /*
        input -> [10, 30, 40, 20, 50];
        
        
        sort -> [10, 20, 30, 40, 50]
        
        50*40*30 -> 
        
        int n = nums.length;
        
        
        1) All postive numbers 
       
        
        2) All negative numbers 
        
        input -> [-1, -2, -7, -5, -4]
        
        sort -> [-7,-5,-4,-2,-1];
        
         Arrays.sort(nums);
        
        int ans = nums[n-1]*nums[n-2]*nums[n-3];
        
        
        3) Some positive and some negative
        
        input -> [-4,-5,2,3,4]       input -> [-1,-2,5,6,7];
        
        
        sort -> [-5, -4, 2, 3, 4];   sort -> [-2,-1,5,6,7];
        
                                            -2 * -1 * 7 -> 14
                                            
                                            or 
                                            
                                            5 * 6 * 7 -> 210
                                            
        
        o/p -> -5 * -4 * 4 -> 80 
            -> -5*-4*2 -> 40
            -> 2*3*4 -> 24 
            -> -5* -4 * 3-> 60 
            
        
           
        
        
        
        
        
        
        */
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int ans =  Math.max( nums[0]*nums[1]*nums[n-1],  nums[n-1]*nums[n-2]*nums[n-3] );
        
        return ans;
        
        
        
    }
}