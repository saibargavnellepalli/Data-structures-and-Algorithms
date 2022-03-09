class Solution {
    public int mySqrt(int x) {
	if(x==0) return 0;
        int s = 1,e =x;
        while(s<e){
        int mid = s+(e-s)/2;
            if(mid<=x/mid && (mid+1)>x/(mid+1))
                return mid;
            else if(mid>x/mid){
                e = mid;
            }
            else {
                s = mid;
            }
            
        }
        return s;
}
}

