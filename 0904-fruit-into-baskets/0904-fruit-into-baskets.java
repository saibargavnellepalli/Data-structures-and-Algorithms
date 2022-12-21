class Solution {
    public int totalFruit(int[] fruits) {
        
        int acq=0, rel=0, n=fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        
        while(acq<n && rel<n){
            
                // ans = Math.max(acq-rel, ans);
                
                if(map.containsKey(fruits[acq])){
                     map.put(fruits[acq],map.get(fruits[acq])+1);
                }
                else{
                    map.put(fruits[acq], 1);
                }
                
            if(map.size() <= 2)
                ans = Math.max(acq-rel+1, ans);
            
                if(map.size() > 2){
              
                    while(map.size() > 2){
                         map.put(fruits[rel], map.get(fruits[rel])-1);
                    
                         if(map.get(fruits[rel]) == 0)
                             map.remove(fruits[rel]);
                    
                         rel += 1;
                }
            }
            
            
            acq += 1;
        }
        
        return ans;
    }
}