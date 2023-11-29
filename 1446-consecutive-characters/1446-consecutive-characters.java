class Solution {
    public int maxPower(String s) {
        
        
        int i=1;
        int n = s.length();
        
        int answer = 1;
        
        while( i < n){
           
            char curCharacter = s.charAt(i);
            char prevCharacter = s.charAt(i-1);
            
            if(curCharacter == prevCharacter){
                // a seqeunce can be possible and we may get the answer
                
                int counter = 1;
                
                while(i<n && s.charAt(i) == prevCharacter){
                    counter++;
                    i++;
                }
                
                if(counter > answer){
                    answer = counter;
                  }
            }
            else{
                i++;
            }
        }
        
        return answer;
    }
}