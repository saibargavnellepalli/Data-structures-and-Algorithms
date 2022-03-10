class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
       int ind =0;
        while(ind<n-1 && arr[ind]<arr[ind+1]) ind++;
        if(ind==0 || ind==n-1 )return false;
      
        for(int i=0;i<n-1;i++){
            if(i<ind){
                if(arr[i]>=arr[i+1]) return false;
            }
            else{
                if(arr[i]<=arr[i+1]) return false;
            }
        }
        return true;
        
    }
}