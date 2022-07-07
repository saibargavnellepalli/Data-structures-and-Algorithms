// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long a[], long b[], int n, int m) 
    {
        // code here 
      long mx = 0;
 
    // Find maximum element of both array
    for(int i = 0; i < n; i++)
    {
        mx = Math.max(mx, a[i]);
    }
     
    for(int i = 0; i < m; i++)
    {
        mx = Math.max(mx, b[i]);
    }
     
    // Increment one two avoid collision of
    // 0 and maximum element of array in
    // modulo operation
    mx++;
    int i = 0, j = 0, k = 0;
     
    while (i < n && j < m && k < (n + m))
    {
         
        // Recover back original element
        // to compare
        long e1 = a[i] % mx;
        long e2 = b[j] % mx;
         
        if (e1 <= e2)
        {
             
            // Update element by adding
            // multiplication with new number
            if (k < n)
                a[k] += (e1 * mx);
            else
                b[k - n] += (e1 * mx);
                 
            i++;
            k++;
        }
        else
        {
             
            // Update element by adding
            // multiplication with new number
            if (k < n)
                a[k] += (e2 * mx);
            else
                b[k - n] += (e2 * mx);
                 
            j++;
            k++;
        }
    }
 
    // Process those elements which are
    // left in array a
    while (i < n)
    {
        long el = a[i] % mx;
        if (k < n)
            a[k] += (el * mx);
        else
            b[k - n] += (el * mx);
             
        i++;
        k++;
    }
 
    // Process those elements which are
    // left in array a
    while (j < m)
    {
        long el = b[j] % mx;
         
        if (k < n)
            b[k] += (el * mx);
        else
            b[k - n] += (el * mx);
             
        j++;
        k++;
    }
 
    // Finally update elements by dividing
    // with maximum element
    for(int in = 0; in < n; in++)
        a[in] = a[in] / mx;
 
    // Finally update elements by dividing
    // with maximum element
    for(int in = 0; in < m; in++)
        b[in] = b[in] / mx;
 
    return;
}
}
