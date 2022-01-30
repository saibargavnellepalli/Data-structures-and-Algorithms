class Solution {
    public int maxSubArray(int[] arr) {
         //generating all the subarray's and check the maximum sub array
        int n = arr.length;
        // int max = Integer.MIN_VALUE;
        // for (int i=0;i<n;i++){
        //     int var=0;
        //     for (int j=i;j<n;j++){
        //        var+=arr[j];
        //         if (var>max){
        //             max = var;
        //         }
        //     }
        // }
        if(n==1) return arr[0];
         int sum=0;
        int max = arr[0];
        for (int i=0;i<n;i++){
            sum+=arr[i];
            
            if (sum>max)
                max = sum;
             if (sum<0)
                sum =0;
           
        }
        
        return max;
    }
}