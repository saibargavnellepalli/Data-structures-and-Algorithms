// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String S = sc.next();
            System.out.println(new Solution().findRank(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find lexicographic rank of a string.
    static final long q = 1000000007;
 
static long findRank(String S) 
  {
      if(check(S))
          return 0;
          
      int n = S.length();
          
      ArrayList<Long> list = new ArrayList<>();
      fillFact(list,n);
      
      int[] count = new int[256];
      
      for(char ch : S.toCharArray())
          count[ch]++;
      
      long temp=0;
      long res=1;
      
      for(int i=0;i<n;i++){
          int p_count = 0;
          char ch = S.charAt(i);
          for(int j=0;j<ch;j++){
              p_count+=count[j];
          }
          temp = (p_count*list.get(n-i-1))%q;
          res = (res+temp)%q;
          count[ch]--;
          
      }
      return res;
       
  }
  static boolean check(String S){
      
      int[] count = new int[256];
      int n = S.length();
      
      for(int i=0;i<n;i++)
          count[S.charAt(i)]++;
          
      for(int i=0;i<256;i++)
          if(count[i]>1)
              return true;
      
      return false;
  }
  
  static void fillFact(ArrayList<Long> list,int n){
      
      long fact =1;
      
      list.add(fact);
      for(int i=1;i<n;i++){
          fact = (fact*i)%q;
          list.add(fact);
      }
  }

}