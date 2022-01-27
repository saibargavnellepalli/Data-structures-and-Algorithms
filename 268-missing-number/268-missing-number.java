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
        int n = arr.length;
        int xor1=arr[0];
        for (int i=1;i<n;i++){
            xor1^=arr[i];
        }

        for (int i=1;i<=n;i++){
            xor1^=i;
        }


        int set_bit = xor1 & ~(xor1-1);

        int x=0;
        int y=0;
        for (int i=0;i<n;i++) {
            if ((arr[i] & set_bit) == 0) {
                x ^= arr[i];
            } else {
                y ^= arr[i];
            }
        }

            for (int i=1;i<=n;i++){
                if ((i&set_bit)==0){
                    x^=i;
                }
                else {
                    y^=i;
                }

        }
       return y;
    }
}