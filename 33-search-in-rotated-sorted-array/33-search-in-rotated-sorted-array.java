class Solution {
   // public int search(int[] nums, int target) {
     public static int search(int[] arr, int target) {
         int n =arr.length;
         if(n==1){
             if(arr[0]==target) return 0;
             else return -1;
         }
        int pivot = findPivot(arr);
        int bs=-1;
        if (target>=arr[0] && target<=arr[pivot]){
             bs = binarySearch(arr,target,0,pivot);
        }
        else {
             bs = binarySearch(arr,target,pivot+1,arr.length-1);
        }
        return bs;
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        //binary search logic
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            }
            else if (arr[mid]>target){
                end=mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

    private static int findPivot(int[] arr) {

        int start =0,end =arr.length-1;
        if (arr[start]<arr[end]) return end;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            else if (arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if (arr[start]<arr[mid]){
                start = mid+1;

            }
            else if (arr[start]>arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }

}
