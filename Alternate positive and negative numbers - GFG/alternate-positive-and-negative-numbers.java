// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        
       ArrayList<Integer> posNums = new ArrayList<>();
       ArrayList<Integer> negNums = new ArrayList<>();
       
       for(int i = 0; i < n; i++){
           if(arr[i] >= 0){
               posNums.add(arr[i]);
           }else{
               negNums.add(arr[i]);
           }
       }
       
       int posIndex = 0, negIndex = 0, i = 0;
       
       while(posIndex < posNums.size() && negIndex < negNums.size()){
           
           if(i%2 == 0){
               arr[i] = posNums.get(posIndex);
               posIndex++;
               i++;
           }else{
               arr[i] = negNums.get(negIndex);
               negIndex++;
               i++;
           }
           
       }
       
       while(posIndex < posNums.size()){
           arr[i] = posNums.get(posIndex);
            posIndex++;
           i++;
       }
       
       while(negIndex < negNums.size()){
           arr[i] = negNums.get(negIndex);
           negIndex++;
           i++;
       }
       
       
   }
}