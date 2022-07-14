// { Driver Code Starts
//Initial Template for Java

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
            String s = "", pat = "";
            s= sc.next();
            pat = sc.next();
            
            if(new match().KMPSearch(pat, s) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    
    
}// } Driver Code Ends


//User function Template for Java


class match
{
    //Function to fill lps[] for given patttern pat[0..M-1]. 
  void computeLPSArray(String pat, int M, int lps[]) 
  { 
   // Your code here
   int len=0;
lps[0]=0;

int i=1;
while(i<M)
{
  if(pat.charAt(i)==pat.charAt(len))
  {
      len++;
      lps[i]=len;
      i++;
  }
  else
  {
      if(len==0)
      {
          lps[i]=0;
          i++;
      }
      else
      {
          len=lps[len-1];
      }
  }
}

  }
  
  //Function to check if the pattern exists in the string or not.
  boolean KMPSearch(String pat, String txt)
  {
      // Your code here
    int n=txt.length();
 int m=pat.length();
 
 int lps[]=new int[m];
 computeLPSArray(pat,m,lps);
 
 int i=0,j=0;
 while(i<n)
 {
     if(pat.charAt(j)==txt.charAt(i))
     {
         i++;
         j++;
     }
     if(j==m)
     {
         j=lps[j-1];
         return true;
     }
     else if(i<n && pat.charAt(j)!=txt.charAt(i))
     {
         if(j==0)
         {
             i++;
         }
         else
         {
             j=lps[j-1];
         }
     }
 }
 return false;
 
}


}
