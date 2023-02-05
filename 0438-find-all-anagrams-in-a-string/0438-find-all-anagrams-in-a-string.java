class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int n1 = s.length();
        int n2 = p.length();

        int temp[] = new int[26];
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n2;i++){
            char ch = p.charAt(i);
            int a = ch-97;
            temp[a] += 1;
        }
        
        int[] arr = new int[26];
        int i=0,j=0;
        while(j<n1){
             char ch = s.charAt(j);
                 int a = ch-97;
                 arr[a] += 1;
            
            if(j-i+1 == n2){
                boolean flag = false;
               for(int k=0;k<26;k++){
                   if(arr[k] != temp[k]){
                       flag = true;
                       break;
                   }
               }
               if(!flag)
                 ans.add(i);

                  char ch1 = s.charAt(i);
                 int a1 = ch1-97;
                 arr[a1] -= 1;
                 i+=1;
            }
            j+=1;
                
        }

        return ans;
    }
}