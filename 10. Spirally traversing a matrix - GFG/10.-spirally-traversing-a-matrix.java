// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        
    ArrayList<Integer> arrayList = new ArrayList<>();
       
       int top = 0;
       int down = r - 1;
       int left = 0;
       int right = c - 1;
   
       while (top <= down && left <= right) {

           if (top <= down && left <= right) {
               for (int i = left; i <= right; i++) {
                   arrayList.add(matrix[top][i]);
                   
               }
               top++;
               
           }
           if (top <= down && left <= right) {
               for (int i = top; i <= down; i++) {
                   arrayList.add(matrix[i][right]);
                   

               }
               right--;
               

           }
           if (top <= down && left <= right) {
               for (int i = right; i >= left; i--) {
                   arrayList.add(matrix[down][i]);
                   
               }
               down--;
       

           }
           if (top <= down && left <= right) {
               for (int i = down; i >= top; i--) {
                   arrayList.add(matrix[i][left]);
               
               }
               left++;


           }
           
       }
       return arrayList;
   }
}
