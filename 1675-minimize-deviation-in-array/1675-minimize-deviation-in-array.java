class Solution {
    public int minimumDeviation(int[] nums) {
        
        int n = nums.length;
               
        int min = Integer.MAX_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            if(nums[i]%2 != 0){
                nums[i] *= 2;
            }
            
            min = Math.min(nums[i],min);
            pq.add(nums[i]);
        }
        
        int minD = Integer.MAX_VALUE;
        
        while(pq.peek()%2 == 0){
            int max = pq.poll();
            minD = Math.min(minD, max-min);
            min = Math.min(min,max/2);
            pq.add(max/2);
        }
        
        
        return  Math.min(minD, pq.peek()-min);
        
    }
}