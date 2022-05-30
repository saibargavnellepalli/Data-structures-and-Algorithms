class Solution {
    public void moveZeroes(int[] arr) {
        int i=0, j=0, n=arr.length;
        
        while(j < n){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
        
        while(i < n){
            arr[i++] = 0;
            
        }
    }
}
