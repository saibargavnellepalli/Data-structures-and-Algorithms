class Solution {
    public boolean isAnagram(String s, String t) {
     
        
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        int n1 = s.length();
        int n2 = t.length();
        
        if(n1 != n2) return false;
        
        for(int i=0;i<n1;i++){
            if(ch1[i] != ch2[i]) return false;
        }
        return true;
    }
}