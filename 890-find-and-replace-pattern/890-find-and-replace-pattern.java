class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans = new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            String ch = words[i];
            boolean f = true;
            for(int j=0;j<ch.length();j++){
                if(ch.indexOf(ch.charAt(j)) != pattern.indexOf(pattern.charAt(j))){
                    f = false;
                }
            }
            
            if(f){
                ans.add(ch);
            }
            
        }
        
        return ans;
    }
}