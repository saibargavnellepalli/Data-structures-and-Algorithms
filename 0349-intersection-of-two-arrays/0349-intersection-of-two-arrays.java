class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int cur : nums1){
            
            if(!map.containsKey(map)){
                map.put(cur, true);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int cur : nums2){
            
            if(map.containsKey(cur) && map.get(cur)){
                ans.add(cur);
                map.put(cur, false);
            }
        }
        
       int arr[] = new int[ans.size()];
        int i=0;
        for(int cur : ans){
            arr[i] = cur;
            i++;
        }
        
        return arr;
    }
}