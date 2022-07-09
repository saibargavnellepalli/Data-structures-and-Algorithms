class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        //sort array based on first element
        Arrays.sort(arr, (a,b) -> a[0] - b[0]); 
        
     int start = arr[0][0];
         int end = arr[0][1];
        for(int i=0;i<arr.length;i++){
            if((arr[i][0]<=end))
                      end = Math.max(end,arr[i][1]);
            else
            {
                ans.add(new int[]{start,end});
          start = arr[i][0];
         end = arr[i][1];
            }
        }
        ans.add(new int[]{start,end});
       
        
            
        
        return ans.toArray(new int[0][]); 
        
        
    }
}