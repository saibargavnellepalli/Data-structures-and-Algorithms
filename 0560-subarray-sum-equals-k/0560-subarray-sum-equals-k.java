class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer = 0;
        int prefixSum = 0;
        
       HashMap<Integer,Integer> map = new HashMap<>();
      
       
        map.put(0,1);
        
        for(int cur : nums){
            prefixSum += cur;
            
            if(map.containsKey(prefixSum-k)){
                answer += map.get(prefixSum-k);
             }
            
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
          
            
        }
        
        return answer;
    }
}