class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int ans=0;
        int sum=0;
        
        
        map.put(0,1);
        
        
        for(int i=0;i<nums.length;i++){
                
                int cur = nums[i];
                sum+= cur;
            
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            
                if(map.containsKey(sum)){
                    map.put(sum, map.get(sum)+1);
                }
                else{
                    map.put(sum,1);
                }
            
            
        }
        
        return ans;
        
    }
}