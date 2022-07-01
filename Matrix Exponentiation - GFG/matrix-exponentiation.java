// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.FindNthTerm(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Integer memo[] = new Integer[n];
      static long mod = (long)(1e9 + 7);
    long [] matrixProd(long [] l, long [] r) {
        long [] ans = new long[4];
        ans[0] = add(mul(l[0] , r[0]) , mul(l[1] , r[2]));
        ans[1] = add(mul(l[0] , r[1]) , mul(l[1] , r[3]));
        ans[2] = add(mul(l[2] , r[0]) , mul(l[3] , r[2]));
        ans[3] = add(mul(l[2] , r[1]) , mul(l[3] , r[3])); 
        return ans;
    }
    long [] fibPower(long [] fibs, int n){
		if (n == 1) return fibs;
        long [] half = fibPower(fibs, n / 2);
        long [] ans = matrixProd(half, half);
        if (n % 2 == 0) return ans;
        ans[0] = add(ans[0], ans[1]);
        ans[2] = add(ans[2], ans[3]);
        ans[1] = (ans[0] - ans[1] + mod) % mod;
        ans[3] = (ans[2] - ans[3] + mod) % mod;
        return ans;
    }
    long add(long a, long b){
    	return (((a % mod) + (b % mod))) % mod;
    }
    long mul(long a, long b){
    	return ((a % mod) * (b % mod)) % mod;
    }
    public int FindNthTerm(int n)
    {
        if (n < 2) return n;
        long [] fibs = {1, 1, 1, 0};
        long [] ans = fibPower(fibs, n);
        return (int)ans[0];
    }
}