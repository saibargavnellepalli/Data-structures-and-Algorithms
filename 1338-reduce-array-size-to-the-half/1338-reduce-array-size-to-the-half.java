class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int elm : arr){
            map.put(elm, map.getOrDefault(elm,0)+1);
        }
        
       int freq[] = new int[map.size()];
        
        int j=0;
        for(int curElement : map.values()){
            freq[j++] = curElement;
        }
        
        Arrays.sort(freq);
        
    
        int n = arr.length;
        int totalSize = n;
        int reqSize = n/2;
        int ans =0;
        for(int i=freq.length-1;i>=0;i--){
            ans+=1;
            System.out.println(totalSize);
             totalSize -= freq[i];
            if(totalSize <= reqSize)
                return ans;
            
           
        }
        
        return 0;
    }
}