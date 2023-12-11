class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        /*
        
        create a hashmap and store the occurances of nums1 values
        
        traverse through the nums2, reduce the occurace of that element
        
        when occurance == 1, we can remove
        
        */
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int cur : nums1){
            
            if(map.containsKey(cur)){
                int val = map.get(cur);
                val+=1;
                map.put(cur, val);
            }
            else{
                map.put(cur,1);
            }
        }
        
        
          ArrayList<Integer> li = new ArrayList<>();
        
        for(int cur : nums2){
            
            if(map.containsKey(cur) && map.get(cur) >= 1){
                
                li.add(cur);
                
                int val = map.get(cur);
                val-=1;
                map.put(cur,val);
            }
        }
        
          int arr[] = new int[li.size()];
        
      for(int i=0;i<arr.length;i++){
          
          arr[i] = li.get(i);
      }
        
        return arr;
    }
}