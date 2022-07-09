class Solution {
    public int firstUniqChar(String s) {
        
       // Map<Character,Integer> set = new HashMap<>();
        
        //frequency array initialization
        int arr[] = new int[123];
        
        //find frequency 
        for(int i=0;i<s.length();i++){
            char currElm = s.charAt(i);
            int cur = currElm;
           arr[cur]+=1;
        }
        
        
        for(int i=0;i<s.length();i++){
            char currElm = s.charAt(i);
             int cur = currElm;
           if(arr[cur]==1)
               return i;
           
         }
        
        return -1;
        
    }
}