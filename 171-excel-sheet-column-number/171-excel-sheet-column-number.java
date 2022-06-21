class Solution {
    public int titleToNumber(String str) {
        
        //formula = res * 26 + (current Character number)
        int res =0;
        for(int i=0;i<str.length();i++){
            res*=26;
            res+=str.charAt(i)-'A'+1;
        }
        return res;
    }
}