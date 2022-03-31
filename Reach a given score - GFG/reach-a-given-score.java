// { Driver Code Starts
// Driver Code
import static java.lang.System.out;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int T = in.nextInt(); T-->0;) {
            int n = in.nextInt();
            
            Geeks obj = new Geeks();
            out.println(obj.count(n));
        }
    }
}// } Driver Code Ends


// Complete this function!

class Geeks {
    public long count(int n) {
       
       int[] arr = {3,5,10};
       
       return combinations(0,n,arr);
    }
    
    public long combinations(int currentIndex, int n , int[] arr){
        
        if(n==0)
        return 1;
        
        if(currentIndex == arr.length)
        return 0;
        
        long consider=0;
        if(arr[currentIndex]<=n){
            consider = combinations(currentIndex, n-arr[currentIndex],arr);
        }
        
        long notConsider = combinations(currentIndex+1, n , arr);
        
        return consider + notConsider;
    }
}