class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        
        int n = profits.length;
        int arr[][] = new int[n][2];
        
        for(int i=0;i<n;i++){
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        
       
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
          int i=0;  
     while(k-- > 0){
         
         while (i < n && arr[i][0] <= w) {
                pq.offer(arr[i][1]);
                i++;
            }
            if (pq.isEmpty()) {
                break;
            }
            w += pq.poll();
     }
        
        return w;
        
       
    }
}