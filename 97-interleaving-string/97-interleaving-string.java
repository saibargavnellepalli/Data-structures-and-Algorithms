class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
     if(s1.length() + s2.length() != s3.length())
		return false;
        return f(s1,s2,s3,0,0,0,new HashMap<String,Boolean>());
        
    }
    private boolean f(String s1, String s2, String s3,int i,int j,int k, HashMap<String,Boolean> memo){
        
        if(i==s1.length() && j==s2.length() && k==s3.length())
            return true;
        String s = i+"-"+j+"-"+k;
        if(memo.containsKey(s))
            return memo.get(s);
        boolean x=false, y=false;
        if(i!=s1.length()){
            if(s1.charAt(i)==s3.charAt(k))
           x= f(s1,s2,s3,i+1,j,k+1,memo);
        }
        if(j!=s2.length()){
             if(s2.charAt(j)==s3.charAt(k))
            y=f(s1,s2,s3,i,j+1,k+1,memo);
        }
        memo.put(s,x||y);
        return x||y;
    }
}