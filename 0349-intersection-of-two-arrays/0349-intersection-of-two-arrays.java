class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        //hashmap for nums1
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int curElement : nums1){
            
            if(!map.containsKey(curElement))
                   map.put(curElement, 1);
        }
        
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int curElement : nums2){
            
            if(map.containsKey(curElement) && map.get(curElement) == 1){
                li.add(curElement);
                map.put(curElement,0);
            }
        }
        
        
        int arr[] = new int[li.size()];
        
      for(int i=0;i<arr.length;i++){
          
          arr[i] = li.get(i);
      }
        
        return arr;
        
        
        
    }
}