class Solution {
    public int subarraySum(int[] arr, int k) {
        int count=0,n=arr.length;
        // for(int i=0;i<n;i++){
        //    int ans =0;
        //     for(int j=i;j<n;j++){
        //         ans+=nums[j];
        //         if(ans == k){
        //             c++;
        //            // break;
        //         }
        //     }
        // }
        // return c;
      
        int curr=0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        for(int i=0;i<n;i++){
            curr+=arr[i];
            if(curr==k) count++;
            if(hash.containsKey(curr-k)){
                count+=hash.get(curr-k);
            }
            if(hash.get(curr)==null) hash.put(curr,1);
            else hash.put(curr,hash.get(curr)+1);
        }
        return count;
    }
}