// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            Solution obj = new Solution();
            
            if(obj.search(p, s) ==  true)
              System.out.println("Yes");
            else
              System.out.println("No");
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
            // Your code here
           int window_len = pat.length();
           int start = 0, i;
           
           while(start + window_len <= txt.length()) {
               int j=start;
               for(i=0 ; i < window_len; i++) {
                   if(txt.charAt(j) != pat.charAt(i))
                    break;
                j++;
               }
               if(i == window_len)
                return true;
               start++;   
           }
           return false;
    }
    
}