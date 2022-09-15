class Solution {
    public int[] findOriginalArray(int[] changed) {
        int[] ans = new int[changed.length/2];  
         int t[] = new int[0];
       
        int n = changed.length;
         Arrays.sort(changed);
        HashMap<Integer,Integer> map = new HashMap<>();
        int ind = 0;
        
        if(n%2 != 0)
            return t;
        
         ans[ans.length-1] = -1;
        
        for(int i=0; i<n;i++){
            if(map.containsKey(changed[i]/2) && changed[i]%2==0){
                //ans[ind++] = changed[i];
                ans[ind++] = changed[i]/2;
                map.put(changed[i]/2,map.get(changed[i]/2)-1);
                if(map.get(changed[i]/2) <= 0)
                map.remove(changed[i]/2);
            }
            else if(map.containsKey(changed[i]*2)){
                 ans[ind++] = changed[i];
                //ans[ind++] = changed[i]*2;
               // map.remove(changed[i]*2);
                   map.put(changed[i]*2,map.get(changed[i]*2)-1);
                if(map.get(changed[i]*2) <= 0)
                map.remove(changed[i]*2);
            }
            else{
                if(map.containsKey(changed[i]) == false)
                map.put(changed[i],1);
                else
                    map.put(changed[i],map.get(changed[i])+1);
            }
        }
        
        return ans[ans.length-1] == -1 ? t : ans;
       
        
        
        
        
    }
}