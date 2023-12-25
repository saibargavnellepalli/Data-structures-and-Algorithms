class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int cur : nums){
            
            if(map.containsKey(cur)){
                map.put(cur, map.get(cur)+1);
            }else{
                map.put(cur, 1);
            }
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int cur : map.values()){
            pq.add(cur);
        }
        
        int max = -1;
        for(int i=1; i<=k; i++){
            max = pq.poll();
        }
        
        int ans[] = new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer> cur : map.entrySet()){
            int key = cur.getKey();
            int val = cur.getValue();
            
            if(val >= max){
                ans[i++] = key;
            }
        }
        
        
        return ans;
        
        
        
        
        
    }
}