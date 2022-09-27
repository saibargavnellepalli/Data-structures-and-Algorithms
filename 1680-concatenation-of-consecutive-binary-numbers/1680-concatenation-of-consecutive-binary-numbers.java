class Solution {
    public int concatenatedBinary(int n) {
        
    
    
    long mod = 1000000000+7;
    long res = 0;
    for(int i=1;i<=n;i++){
        res = ((res << (1+(int)(Math.log(i)/Math.log(2))))%mod + i)%mod; 
    }
    return (int)res;
}
}