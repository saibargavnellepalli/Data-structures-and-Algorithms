class Solution {
  Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        combinations(0,0,nums,list);
        return new ArrayList<>(ans);
    }
    
    public void combinations(int i, int sum, int[] arr, List<Integer> list){
        
       // System.out.println(list);
           
        if(i==arr.length){
            List<Integer> l = new ArrayList<>();
            l.addAll(list);
            Collections.sort(l);
           ans.add(l);
            return;
        }
        
        
        
       list.add(arr[i]);
      
        combinations(i+1,sum,arr,list);
        
        int n = list.size();
       
        list.remove(n-1);
        
        combinations(i+1,sum,arr,list);
    }
}