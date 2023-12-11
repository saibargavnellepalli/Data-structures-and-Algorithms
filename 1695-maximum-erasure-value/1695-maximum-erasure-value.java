class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        
           
        HashMap<Integer,Integer>  map = new HashMap<>();
        int acq=0, rel=0;
        int ans = 0;
        int sum = 0;
        
        int n = nums.length;
        
       for(acq =0; acq<n; acq++){
           
           int curElm = nums[acq];
           
           //substring is invalid
           if(map.containsKey(curElm)){
               
               while(rel< n && map.containsKey(curElm)){
                   map.remove(nums[rel]);
                   sum -= nums[rel];
                   rel++;
               }
           }
           
           //substring is valid
           map.put(curElm,acq);
           
           sum += curElm;
           
           ans = Math.max(sum, ans);
           
       }
        
        return ans;
    }
}