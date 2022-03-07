/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
   while(st<=end){
            int mid = st+(end-st)/2;
            if(MountainArray.get(mid)>target){
                end = mid-1;
            }
            else if(MountainArray.get(mid)<target){
                st = mid+1;
            }
            else{
              ans= MountainArray.get(mid);
                break;
            }
        }
 * }
 */
 
class Solution {
    public  int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
       int peak = peakfun(mountainArr,0,n-1);
        int left = leftfun(mountainArr,target,0,peak);
        
        if(left ==-1){
             
             int right = rightfun(mountainArr,target,peak+1,n-1);
            return right;
        }
        else{
            return left;
        }
        
        //return -1;
        
     
    }
     public int peakfun(MountainArray arr,int st,int end) {
         int ans=-1;
      while(st<=end){
            int mid = st+(end-st)/2;
            if(arr.get(mid)<arr.get(mid+1)){
                st = mid+1;
            }
            else if(arr.get(mid-1)>arr.get(mid)){
                end = mid;
            }
            else{
            ans= mid;
                break;
            }
        }
         return ans;
 
    }
    public int leftfun(MountainArray arr,int target,int st,int end){
       while(st<=end){
            int mid = st+(end-st)/2;
            if(arr.get(mid)>target){
                end = mid-1;
            }
            else if(arr.get(mid)<target){
                st = mid+1;
            }
            else{
              return mid;

            }
        }
        return -1;
    }
       public int rightfun(MountainArray arr,int target,int st,int end){
       while(st<=end){
            int mid = st+(end-st)/2;
            if(arr.get(mid)<target){
                end = mid-1;
            }
            else if(arr.get(mid)>target){
                st = mid+1;
            }
            else{
              return mid;

            }
        }
        return -1;
    }
}
