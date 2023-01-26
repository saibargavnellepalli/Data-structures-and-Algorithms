class Solution {
    public int[][] merge(int[][] arr) {
        
      List<int[]> ans = new ArrayList<>();
        
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        
        int a = arr[0][0], b = arr[0][1];
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i][0]>=a && arr[i][0]<=b){
                if(arr[i][1] > b) 
                    b = arr[i][1];
            }
            else{
                int ar[] = {a,b};
                ans.add(ar);
                a=arr[i][0];
                b=arr[i][1];
                
            }
        }
        
                int ar[] = {a,b};
                ans.add(ar); 
               
        
                 
         //System.out.println(ans);
       int ansAr[][] = new int[ans.size()][2];
        int i=0;
        for(int[] cur : ans){
            //System.out.println(Arrays.toString(cur));
            ansAr[i][0] = cur[0];
            ansAr[i][1] = cur[1];
            i++;
        }
        
        
        return ansAr;
    }
}