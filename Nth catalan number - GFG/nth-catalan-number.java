// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.math.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //taking number of elements
		    int n=sc.nextInt();
		   
		    //calling findCatalan() method
		    System.out.println(new Solution().findCatalan(n));
		}
	}
}// } Driver Code Ends



class Solution
{
    //Function to find the nth catalan number.
    public static BigInteger findCatalan(int n)
    {
        //Your code here
        return catalan(n, new HashMap<Integer,BigInteger>());
        
    }
    public static BigInteger catalan(int n,HashMap<Integer,BigInteger> memo){
        if(n==0 || n==1 )
        return BigInteger.ONE;
        
        int currentKEY = n;
        
        if(memo.containsKey(currentKEY))
        return memo.get(currentKEY);
        
        BigInteger ans = BigInteger.ZERO;
  
        
        for(int i=0;i<n;i++){
            ans = ans.add(catalan(i,memo).multiply(catalan(n-i-1,memo)));
        }
        
        memo.put(n,ans);
        
        return ans;
    }
}