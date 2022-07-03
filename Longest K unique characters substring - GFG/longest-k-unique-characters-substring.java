// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
         HashMap<Character,Integer> map = new HashMap<>();
        int ans=0,dist=0,n=s.length(),acq=0,rel=0;
        while(acq<n){
             Character curr = s.charAt(acq);
            if(map.containsKey(curr))
                 map.put(curr,map.get(curr)+1);
            else{
                map.put(s.charAt(acq),1);
                dist+=1;
            }
            while(rel<=acq && dist>k){
                Character disChar = s.charAt(rel);
                map.put(disChar,map.get(disChar)-1);
                if(map.get(disChar)==0){
                    map.remove(disChar);
                    dist-=1;
                }
                 rel+=1; 
            }
            if(dist==k)
            ans = Math.max(ans,acq-rel+1);
            acq+=1;

        }
        return ans==0?-1:ans;
    }
}