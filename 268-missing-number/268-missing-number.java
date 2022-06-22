class Solution {
    public int missingNumber(int[] arr) {
           /*  int n = arr.length;
        int s1 = n*(n+1)/2;
        int sum1=0;
        for (int i=0;i<n;i++){
            sum1+=arr[i];
        }
        int s2 = n*(n+1)*(2*n+1)/6;
        int sum2=0;
        for (int i=0;i<n;i++){
            sum2+=arr[i]*arr[i];
        }
        int a = s1-sum1;
        int b = s2-sum2;
        int z = b/a;
        int x = (z+a)/2;
        int y = (x-a);
        System.out.println(x+" "+y);

       */

        //Xor Method
       int sum1 = 0;
        for(int n:arr)
            sum1+=n;
        int n = arr.length;
        int sum2 = (n*(n+1))/2;
        return sum2-sum1;
    }
}