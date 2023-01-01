class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        String arr[] = s.split(" ",-1);
        
        if(arr.length != pattern.length()) return false;
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,arr[i]);
                set.add(arr[i]);
            }
            else{
                String temp = map.get(ch);
                if(!temp.equals(arr[i]))
                    return false;
            }
        }
        
    
        return set.size() == map.size();
        
    }
}