class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int rel = 0;        
        int ans = 0;
        int acq=0;
        int start = 0, end=0;
        
        int sum = 0;
        
        for( acq=0; acq<n; acq++){
                
            int ch = nums[acq];
            
            if(map.containsKey(ch)){
                
                while(rel < n && map.containsKey(ch)){
                    map.remove(nums[rel]);
                    sum-=nums[rel];
                    rel++;
                }
               
            }
                map.put(ch,acq);
                sum += ch;
                ans = Math.max(sum,ans);
            
        }
        
        

        
        return ans;
        
    }
}