class WordDictionary {
    ArrayList<String> al;
    public WordDictionary() {
        al = new ArrayList<>();
    }
    
    public void addWord(String word) {
        al.add(word);
    }
    
    public boolean search(String word) {
        for(int ind=0;ind<al.size();ind++){
            String cur = al.get(ind);
            
            
            
              if(check(word,cur)) return true;
        }
                   return false;
    }
    
    public boolean check (String word,String cur){
        int i=0,j=0;
            if(cur.length() != word.length())
                return false;
        while(i<cur.length()){
                char c1 = cur.charAt(i);
                char c2 = word.charAt(i);
                
                if(c1 == '.' || c2=='.' || c1==c2){
                   i++;
                   j++;
                   }
                  else  return false;
            }
        return true;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */