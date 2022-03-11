class Solution {
    public int[] sumZero(int n) {
        int arr[]= new int[n];
        int i=0;
        
        if(n%2!=0){
            arr[0]=0;
             i=1;
        }
        
        int cut =n/2;
        int temp = cut;
        
        if(n%2==0){
            cut = cut-1;
        }
        while(i<=cut){
          arr[i] = temp -(2*temp);
            temp--;
            i++;
        }
        
        temp = n/2;
        
        while(i<n){
            arr[i] = temp;
            i++;
            temp--;
        }
        
        return arr;
    }
}