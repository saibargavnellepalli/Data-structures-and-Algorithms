class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int sum = arrSum(piles);
        
       int st=1,end=sum;
        while(st<=end){
            int mid = st+(end-st)/2;
            
            if(bs(mid,h,piles)){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return st;
    }
    
    
    public boolean bs(int t, int h, int nums[]){
        
        
        for(int i=0;i<nums.length;i++){
            
            if(h<0){
                return false;
            }
            
            int cur = nums[i];
            if(cur<t){
                
                h-=1;
            }
            else{
                h-=(cur/t);
                if(cur%t != 0)
                    h-=1;
            }
             if(h<0){
                return false;
            }
            
       }
        
        return true;
    }
    
    public int arrSum(int nums[]){
        int sum = 0;
        for(int cur : nums){
            sum = Math.max(cur,sum);
        }
        
        return sum;
    }
}