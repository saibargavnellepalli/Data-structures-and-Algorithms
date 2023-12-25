class Solution {
    public int findKthLargest(int[] nums, int k) {
         
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int cur : nums){
            pq.add(cur);
        }
        
        
        for(int i=1; i<k; i++){
            pq.poll();
        }
        
        return pq.poll();
    }
}