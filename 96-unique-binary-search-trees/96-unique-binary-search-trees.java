class Solution {
    public int numTrees(int n) {
       
       // Integer arr[] = new Integer[200];
       return total(n,new HashMap<Integer,Integer>());
    }
    private int total(int n, HashMap<Integer,Integer> map){
    if(n==0 || n==1)
       return 1;
  
    if(map.containsKey(n))
        return map.get(n);
    int ways = 0;
        
    for(int i=0;i<n;i++){
       ways+= total(i,map)*total(n-i-1,map);
    }
        map.put(n,ways);
    return ways;
}
}