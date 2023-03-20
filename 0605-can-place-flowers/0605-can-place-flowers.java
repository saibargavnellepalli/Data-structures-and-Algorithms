class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int len = arr.length;
        
        if(len == 1){
            if(arr[0] == 0){
                return true;
            }
            else{
                if(n==1) return false;
                return true;
            }
        }
        
        if(len>=2){
            if(arr[0] == 0  && arr[1] == 0) {arr[0] = 1;
            n--;
                            }
        }
        
        
        // System.out.println(n);
        
        for(int i=1;i<len-1;i++)
        {
            if(arr[i] == 0){
                if(arr[i-1] != 1 && arr[i+1] != 1){
                    arr[i] = 1;
                    n--;
                }
            }
        }
       // System.out.println(n);
       if(arr[len-1] == 0){
           if(arr[len-2] == 0)
               n--;
       }
        // System.out.println(n);
        if(n>0) return false;
        
        return true;
    }
}