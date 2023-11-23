class Solution {
    public int[][] generateMatrix(int n) {
        int c1 = 0, c2 = n-1;
        int r1 = 0, r2 = n-1;
        int arr[][] = new int[n][n];
        int elm = 1;
        while(r1<=r2 && c1<=c2){
            
            //step-1
            for(int i=c1;i<=c2;i++){
                arr[r1][i] = elm;
                elm+=1;
            }
            r1 = r1+1;
            
            //step-2
            for(int i=r1;i<=r2;i++){
                arr[i][c2] = elm;
                elm+=1;
              }
            c2 = c2-1;
            
            //step-3
            for(int i=c2;i>=c1;i--){
                arr[r2][i] = elm;
                elm+=1;
            }
            r2=r2-1;
            
            //step-4
            for(int i=r2;i>=r1;i--){
                arr[i][c1] = elm;
                    elm+=1;
            }
            c1 = c1+1;
        }
        return arr;
    }
}