class Solution {
    public boolean isHappy(int n) {
        int temp=0;
        HashSet<Integer> set = new HashSet<>();
        
        set.add(n);
        while(true){
           
         
            System.out.println(set);
            String s = Integer.toString(n);
            int sq=0,len=s.length();
            for(int i=0;i<len;i++){
                
                sq+=(s.charAt(i)-'0')*(s.charAt(i)-'0');
            }
        if(sq==1)
            return true;
           if(set.contains(sq))
               return false;
            set.add(sq);   
            n=sq;
                
          
            
        }
    }
}