class Solution {
    public int[] searchRange(int[] arr, int target) {
 
        int temp[] = new int[2];
       temp[0] = firstInd(arr,target);
        temp[1] = lastInd(arr,target);
        return temp;
    }

    private static int firstInd(int[] arr, int target) {
        int res=-1;
        int start =0,end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            //if equal then it may happen that the target may present in left half
            //so will move end to mid-1;
            else {
                res = mid;
                end = mid-1;
            }
        }
        return res;
        
    }
    private static int lastInd(int[] arr, int target) {
        int res=-1;
        int start =0,end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            //if equal then it may happen that the target may present in left half
            //so will move end to mid-1;
            else {
                res = mid;
                start = mid+1;
            }
        }
        return res;

    }
}
