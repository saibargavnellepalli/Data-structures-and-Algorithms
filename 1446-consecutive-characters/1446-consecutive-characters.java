class Solution {
    public int maxPower(String s) {
        
        char prev = s.charAt(0);
        
        int i=1;
        int n = s.length();
        int answer = 1;
        
        while(i<n){
           
            if(s.charAt(i) == prev){
                int curCount = 1;
                
                while(i<n && s.charAt(i) == prev){
                    curCount++;
                    prev = s.charAt(i);
                    i++;
                }
                
                answer = Math.max(answer,curCount);
            }
            else{
               
                prev = s.charAt(i);
                 i++;
            }
            
        }
        
        return answer;
    }
}