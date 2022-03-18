class Solution {
    public int climbStairs(int n) {
    return totalWays(0, n, new HashMap<Integer,Integer>());
    }
    public int totalWays(int currentStair, int  targetStair, HashMap<Integer,Integer> memo ){
        if(currentStair==targetStair) return 1;
        
          if(currentStair>targetStair) return 0;
        
        //check if subproblem has already occured or not
      //  int currentKey = currentStair;
        
        if(memo.containsKey(currentStair)) return memo.get(currentStair);
        
        int oneJump = totalWays(currentStair+1, targetStair,memo );
        int twoJump = totalWays(currentStair+2, targetStair,memo );
          
        memo.put(currentStair,oneJump+twoJump);
        return oneJump+twoJump; 
        
    
        
        
    }
}