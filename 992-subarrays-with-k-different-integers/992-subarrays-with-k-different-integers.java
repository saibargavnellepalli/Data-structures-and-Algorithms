class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int nums[],int k){
         HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0,dist=0,n=nums.length,acq=0,rel=0;
        while(acq<n){
             int curr = nums[acq];
            if(map.containsKey(curr))
                 map.put(curr,map.get(curr)+1);
            else{
                map.put(nums[acq],1);
                dist+=1;
            }
            while(rel<=acq && dist>k){
                int disChar = nums[rel];
                map.put(disChar,map.get(disChar)-1);
                if(map.get(disChar)==0){
                    map.remove(disChar);
                    dist-=1;
                }
                 rel+=1; 
            }
            
                 ans +=acq-rel+1;
            acq+=1;

        }
        return ans;
    }
}