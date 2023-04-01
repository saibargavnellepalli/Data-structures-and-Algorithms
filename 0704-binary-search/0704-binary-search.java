class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,target);
    }
    
    public int bs(int arr[], int k){
        int l=0,e=arr.length-1;
        
        while(l<=e){
            int m = l+(e-l)/2;
            
            if(arr[m] < k){
                l = m+1;
            }
            else if(arr[m]>k){
                e = m-1;
            }
            else{
                return m;
            }
        }
    return -1;    
    }
    
}