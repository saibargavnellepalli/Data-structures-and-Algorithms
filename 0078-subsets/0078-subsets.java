class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        combinations(0,0,nums,list);
        return ans;
    }
    
    public void combinations(int i, int sum, int[] arr, List<Integer> list){
        
        //System.out.println(sum);
           
        if(i==arr.length){
           ans.add(new ArrayList<>(list));
            return;
        }
        
        
            
       
        list.add(arr[i]);
      
        combinations(i+1,sum,arr,list);
        
        int n = list.size();
       
        list.remove(n-1);
        
        combinations(i+1,sum,arr,list);
    }
}