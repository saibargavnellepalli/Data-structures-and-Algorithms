class Solution {
    public int[] sumZero(int n) {
        int arr[]= new int[n];
        int i=0;
        
     int l=0,r=n-1;
        int temp = n/2;
        while(l<r){
            arr[l] = temp;
            arr[r] = temp-2*temp;
            temp--;
           // i++;
            l++;
            r--;
        }
        
        
        
        return arr;
    }
}