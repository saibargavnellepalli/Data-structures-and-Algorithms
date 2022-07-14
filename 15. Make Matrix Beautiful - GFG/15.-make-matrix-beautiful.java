// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
             int matrix[][] = new int[n][n];
            String str[] = read.readLine().trim().split("\\s+");
            int k =0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  matrix[i][j] = Integer.parseInt(str[k++]);
            }
            Solution ob = new Solution();
            System.out.println(ob.findMinOperation(matrix,n));
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    static int findMinOperation(int matrix[][], int n)
    {
        // code here 
  int maxsum = Integer.MIN_VALUE;
        int[] a = new int[n];
    
        for(int i = 0; i < n; i++){
            int row = 0, col = 0;
            for(int j = 0; j < n; j++){
                row += matrix[i][j];
                col += matrix[j][i];
            }
            a[i] = row;
            maxsum = Math.max(maxsum ,Math.max(col, row));   
        }

        int Result = 0;
        for(int i = 0; i < n; i++){
            Result += (maxsum - a[i]);
        }
        return Result;
    }
}