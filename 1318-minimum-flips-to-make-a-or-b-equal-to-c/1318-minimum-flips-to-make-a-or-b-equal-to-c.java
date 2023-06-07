class Solution {
    public int minFlips(int a, int b, int c) {
        
        int res=0;
        
        while(a>0 || b>0 || c>0){
            
            if((c&1)==0){
                if((a&1)==1) res++;
                if((b&1)==1) res++;
            
            }
            else if((a&1)==0 && (b&1)==0) res++;
            
            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        
        return res;
    }
   
}