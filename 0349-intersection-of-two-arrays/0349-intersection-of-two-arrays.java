class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i], 1);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int cur : nums2){
            
              
            
            if(map.containsKey(cur) && map.get(cur) == 1){
                ans.add(cur);
                map.put(cur,0);
            }
        }
        
        
        int arr[] = new int[ans.size()];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = ans.get(i);
        }
        
        return arr;
    }
    
    
    
}