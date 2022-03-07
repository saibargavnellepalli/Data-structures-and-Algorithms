class Solution {
    public int findPeakElement(int[] arr) {
              int n = arr.length;
        if(n==1) return 0;
        else if(n==2) if(arr[0]>arr[1]) return 0;
         else return 1;
        else if(n==3) {
            int ind = 0;
            if(arr[1]>arr[0] && arr[1]>arr[2]) ind = 1;
          else if(arr[0]>arr[1] && arr[0]>arr[2]) ind =0;
            else  if(arr[2]>arr[0] && arr[2]>arr[1]) ind =2;
            return ind;
        }
        if(arr[0]>arr[1]) return 0;
        if (arr[n-1]>arr[n-2]) return n-1;
       
    int st = 0, end =n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<arr[mid+1]) st = mid+1;
            else if(arr[mid-1]>arr[mid]) end = mid-1;
            else return mid;
        }
        return -1;
    }
}