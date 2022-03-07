class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length-1;
    int st = 0, end =n;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<arr[mid+1]) st = mid+1;
            else if(arr[mid]<arr[mid-1]) end = mid-1;
            else return mid;
        }
        return -1;
   
    }
}