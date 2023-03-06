class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int s = 0, e = n-1;
       while(s<=e){
           int m = (s+e)/2;
           
           if((arr[m]-(m+1)) < k){
               s = m+1;
           }
           else
               e = m-1;
       }
        return s + k;
    }
}