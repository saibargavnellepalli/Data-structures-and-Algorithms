class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = fruits.length;
        int windowStart = 0,ans=0;
        
        for(int i=0;i<n;i++){
            
            
        
               
            
            if(!map.containsKey(fruits[i])){
                map.put(fruits[i],1);
            }
            else{
                int val = map.get(fruits[i]);
                map.put(fruits[i],val+1);
            }
            
            if(map.size()==2){
                ans = Math.max(ans,i-windowStart+1);
            }
            
             while(map.size()>2){
                ans = Math.max(ans, i-windowStart);
                int val = map.get(fruits[windowStart]);
                map.put(fruits[windowStart],val-1);
                if(val-1 <=0){
                    map.remove(fruits[windowStart]);
                }
                    windowStart ++;
            }
        
            
            
        }
        
       
        return windowStart == 0 ? n : ans;
    }
}