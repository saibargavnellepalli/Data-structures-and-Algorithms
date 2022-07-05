// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.getSubstringWithEqual012(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
        // code here
        //Initialize Hashmap
        Map<String,Integer> map = new HashMap<>();
        long ans = 0;
        int z0=0,z1=0,z2=0;
        map.put("0|0",1);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='0') z0++;
            if(ch=='1') z1++;
            if(ch=='2') z2++;
            
            //expression
            String exp = (z1-z0)+"|"+(z2-z1);
            if(map.containsKey(exp)){
                ans+=map.get(exp);
                map.put(exp,map.get(exp)+1);
            }
            else
               map.put(exp,1);
        }
        return ans;
        
    }
} 