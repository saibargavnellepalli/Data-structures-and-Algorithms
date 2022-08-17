class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String d[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<Character,String> map = new HashMap<>();
        int alpha = 97;
        for(int i=0;i<26;i++){
            char ch = (char)alpha;
            alpha +=1;
            map.put(ch,d[i]);
        }
        
        Set<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String ans = "";
            for(int j=0;j<words[i].length();j++){
              ans += map.get(words[i].charAt(j));
            }
            set.add(ans);
        }
        return set.size();
    }
}