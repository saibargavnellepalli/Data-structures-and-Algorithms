class Solution {
    public int minFlipsMonoIncr(String s) {
      
        int zeros=0, ones=0, ans=0;
       for(char ch : s.toCharArray()){
           if(ch=='0'){
               zeros ++;
               if(ones > 0){
                   ans += 1;
                   ones --;
                      
               }
           }
           else if(ch=='1'){
               ones ++;
           }
       } 
        return ans; 
    }
}