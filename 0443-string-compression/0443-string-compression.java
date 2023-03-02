class Solution {
    public int compress(char[] chars) {
        String s = "";
        char prev = chars[0];
        int len = 0;
        
        for(char ch : chars){
            if(ch == prev){
                len ++;
            }
            else{
                s += prev;
                if(len != 1)
                s+= String.valueOf(len);
                prev = ch;
                
                len = 1;
            }
        }
        
       
            s += prev;
        if(len != 1)
            s+= String.valueOf(len);
        
        
      //  System.out.println(s);
        
        for(int i=0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        
        return s.length();
    }
}