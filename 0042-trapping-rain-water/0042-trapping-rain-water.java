class Solution {
    public int trap(int[] arr) {
        
        int n = arr.length;
        int  maxArr[] = new int[n];
        int max = arr[n-1];
        for(int k=n-1;k>=0;k--){
            if(arr[k] > max)
                
                max = arr[k];
                
            
            
                maxArr[k] = max;
            
        }
        
        System.out.println(Arrays.toString(maxArr));
        max = arr[0];
        
      int marArrLeft[] = new int[n];
    
        for(int i=0;i<n;i++){
            if(arr[i] > max)
                //marArrLeft[i] = -1;
                max = arr[i];
            
                marArrLeft[i] = max;
            
        }
        
        //System.out.println(Arrays.toString(marArrLeft));
       
        int ans =0;
        for(int i=1;i<n-1;i++){
            
            ans += Math.min(marArrLeft[i],maxArr[i])-(arr[i]);
        }
        
        return ans;
    }
}