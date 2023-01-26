class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> al = new ArrayList<>();
       List<String> l = new ArrayList<>();
        
        f(0,s,l,al);
        return al;
    }
    public void f(int ind, String s, List<String> l, List<List<String>> al){
        if(ind == s.length()){
            al.add(new ArrayList<>(l));
            return;
        }
        
        for(int i=ind;i<s.length();i++){
            
            if(isP(s.substring(ind,i+1))){
                l.add(s.substring(ind,i+1));
                f(i+1,s,l,al);
                l.remove(l.size()-1);
            }
        }
    }
    
    public boolean isP(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}