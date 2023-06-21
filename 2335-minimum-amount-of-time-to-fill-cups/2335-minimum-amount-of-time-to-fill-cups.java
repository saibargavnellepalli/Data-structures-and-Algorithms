class Solution {
    public int fillCups(int[] amount) {
        
        
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        pq.add(amount[0]);
        pq.add(amount[1]);
        pq.add(amount[2]);

        
        while(!pq.isEmpty() && pq.peek() != 0){
           int t1 = pq.poll();
           int t2 = pq.poll();
            
          if(t2 == 0){
              ans += t1;
          }
            else{
                ans++;
                pq.add(t1-1);
                pq.add(t2-1);
            }
            
            
        }
        
        return ans;
       
           
    }
    
}