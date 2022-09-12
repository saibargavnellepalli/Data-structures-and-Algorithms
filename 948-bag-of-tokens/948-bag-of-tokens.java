class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1;
        int s=0;
        
        while(i<=j){
            if(power >= tokens[i]){
                s++;
                power -= tokens[i];
                i++;
            }
            else if(s > 0 && i!=j){
                power += tokens[j];
              
           
                    s--;
                
                  j--;
            }
            else{
                break;
            }
        }
        
        return s;
    }
}