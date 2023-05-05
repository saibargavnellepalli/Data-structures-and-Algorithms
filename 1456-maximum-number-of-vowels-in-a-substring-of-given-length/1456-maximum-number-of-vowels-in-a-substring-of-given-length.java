class Solution {
    public int maxVowels(String s, int k) {
        
        HashSet<Character> set = new HashSet<>();
        
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        
        System.out.println(s.length());
        
        int vowels = 0,ans=0;
        int j=0,i=0;
        for(i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                vowels++;
            }
        }
        
         ans = Math.max(ans,vowels);
        
        
        for(int ind=i;ind<s.length();ind++){
            if(set.contains(s.charAt(j)))  vowels--;
            if(set.contains(s.charAt(ind))) vowels++;
            
            j++;
            
            ans = Math.max(ans,vowels);
            
        }
        
        return ans;
    }
}