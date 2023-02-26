class Solution {
    public int minDistance(String word1, String word2) {
       
        Integer dp[][] = new Integer[word1.length()][word2.length()];
        return minOperations(word1.length()-1, word2.length()-1,word1,word2, dp);
    }
    
    public int minOperations(int i, int j, String str1, String str2, Integer[][] dp){
        
        if(i<0)
           
            return j+1;
        
        if(j<0) return i+1;
        
        if(dp[i][j] != null) return dp[i][j];
        
        if(str1.charAt(i) == str2.charAt(j)){
            return dp[i][j]=0+minOperations(i-1,j-1,str1,str2,dp);
        }
        
        // insert
        int insert = 1+minOperations(i,j-1,str1,str2,dp);
        int delete = 1+minOperations(i-1,j,str1,str2,dp);
        int replace = 1+minOperations(i-1,j-1,str1,str2,dp);
        
        return dp[i][j] = Math.min(insert,Math.min(delete,replace));
    }
}