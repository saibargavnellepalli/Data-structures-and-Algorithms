// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- >0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            int q = 101;
            
            match obj = new match();
            
            if(obj.search(p, s, q) == true)
             System.out.println("Yes");
            else
              System.out.println("No");
        }
    }
}// } Driver Code Ends


//User function Template for Java

class match
{
    static int d= 256;
    //Function to check if the pattern is present in string or not.
    static boolean search(String pat, String txt, int q){
   int p=0,t=0,h=1,n=txt.length(),m=pat.length();
      for(int i=0;i<m-1;i++)
      h=(h*d)%q;
      for(int i=0;i<m;i++){
          t=(t*d+txt.charAt(i))%q;
          p=(p*d+pat.charAt(i))%q;
      }
       for(int i=0;i<=n-m;i++)
{
    
    if(p==t)
    {
        int j;
        for(j=0;j<m;j++)
        {
            if(pat.charAt(j)!=txt.charAt(i+j))
                  break;
        }
        if(j==m)
        return true;
    }
     if(i<n-m)
    {
     t = (d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q;
        if(t<0)
        t = t+q;
    }
}
return false;


   }
}