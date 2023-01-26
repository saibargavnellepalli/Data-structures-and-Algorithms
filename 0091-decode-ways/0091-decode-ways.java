class Solution {
    public int numDecodings(String s) {
       
        Integer[] memo = new Integer[s.length() + 1];
        return f(0,s,s.length(),memo);
    }
    
    public int f(int i, String s, int n,Integer[] memo){
        if(i==n) return 1;
        
        if(s.charAt(i) == '0') return 0;

        if (memo[i] != null) {
		return memo[i];
	}
        
        int way1=0,way2=0;
        
        way1 = f(i+1,s,n,memo);
        
        if(i < n-1 && Integer.parseInt(s.substring(i,i+2)) <= 26){
            way2 = f(i+2,s,n,memo);
        }
        
        return memo[i]=way1 + way2;
    }
}