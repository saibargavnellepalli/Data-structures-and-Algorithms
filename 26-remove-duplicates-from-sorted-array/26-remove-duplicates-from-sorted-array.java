class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length-1;
        LinkedHashSet<Integer> dups = new LinkedHashSet<>();
        
        for(int num : nums){
            
            dups.add(num);
        }
        
        int k = dups.size();
        
        int i=0;
       for(int elm : dups){
           nums[i++] = elm;
       }
        return k;
    }
}