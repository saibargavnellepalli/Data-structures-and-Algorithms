class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int sum=0;
        int max=-1;
        
        for(int cur : weights){
            sum += cur;
            max = Math.max(max,cur);
        }
        
        
        int low = max, high = sum,ans=0;
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if(isSufficient(mid,weights,days)){
                ans = mid;
                high = mid-1;
                
            }
            else{
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    public boolean isSufficient(int maxWeight, int[] arr, int D){
        int curDays = 1, curSum = 0;
        
        for(int i=0;i<arr.length;i++){
           
            
            if(curSum +arr[i] > maxWeight){
                curSum = arr[i];
                curDays ++;
            }
            else{
                curSum += arr[i]; 
            }
            
           
        }
        
        if(curDays <= D)
            return true;
        
        return false;
    }
    }
