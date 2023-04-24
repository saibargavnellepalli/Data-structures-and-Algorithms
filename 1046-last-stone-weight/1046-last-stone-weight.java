class Solution {
    public int lastStoneWeight(int[] stones) {
       
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int cur : stones)
            pq.add(cur);
                //    System.out.println(pq);

        while(pq.isEmpty() == false){
            
            if(pq.size()>=2){
                int x = pq.poll();
                int y = pq.poll();
                int max = Math.max(x,y);
                 int min = Math.min(x,y);
                
                if(x != y){
                   pq.offer(max-min);
                }
            }
            else{
                if(pq.size() == 1)
                    return pq.poll();
            }
            
           // System.out.println(pq);
        }
        
        return 0;
    }
}