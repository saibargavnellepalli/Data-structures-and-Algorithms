class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int n1=-1,n2=-1,c1=0,c2=0;
        
        for(int elm : nums){
            if(n1==elm)c1++;
            else if(n2==elm) c2++;
            else if(c1==0){
                n1=elm;
                c1=1;
            }
            else if(c2==0){
                n2=elm;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        int a=0,b=0;
        int n=nums.length;
         int maj = n/3;
        for(int elm : nums){
            if(elm==n1)a++;
            else if(elm==n2)b++;
        }
        if(a>maj) list.add(n1);
        if(b>maj)list.add(n2);
        
        return list;
        
        
    }
}