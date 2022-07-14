// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

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
            
            if(obj.search(p, s) == true)
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
         
       int j=0;
      for(int i=0;i<txt.length();i++){
          if(pat.charAt(j)==txt.charAt(i))
          j++;
          else{
              j=0;
              if(pat.charAt(j)==txt.charAt(i))
              j++;
          }
          if(j==pat.length())
          return true;
      }
      return false;
    }
}
