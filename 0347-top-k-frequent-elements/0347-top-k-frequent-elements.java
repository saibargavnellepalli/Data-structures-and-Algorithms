class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
      //step-1 
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for(int cur : nums){
            if(map.containsKey(cur)){
                map.put(cur, map.get(cur)+1);
            }
            else{
                map.put(cur,1);
            }
        }
        
        //step-2
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int cur : map.values()){
            pq.offer(cur);
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=1; i<=k; i++){
            min = pq.poll();
        }
        
        
        //step-3
        int ans[] = new int[k];
        int i=0;
        
        for(Map.Entry<Integer,Integer> cur : map.entrySet()){
            int original = cur.getKey();
            int val = cur.getValue();
            
            if(val >= min){
                ans[i++]= original;
            }
        }
        
        return ans;
    }
}