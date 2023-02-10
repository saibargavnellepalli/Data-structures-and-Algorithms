class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        /*
        

IV -> 4
IX -> 9

XL -> 40
XC -> 90

CD -> 400
CM -> 900

*/
        
        int ans =0, n= s.length();
        
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);
        
        
        
       //  String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        //int[] values =   {1000,900, 500, 400, 100, 90, 50, 40,  10, 9,   5,  4,   1};
        
        boolean f = false;
        for(int i=0;i<n-1;i++){
            if(map.containsKey(s.substring(i,i+2))){
                if(i+1==n-1) f=true;
                ans += map.get(s.substring(i,i+2));
                System.out.println(s.substring(i,i+2) +" "+ans);
                i++;
            }
            else{
                ans += map.get(s.charAt(i)+"");
            }
        }
        
        
        if(!f){
            ans += map.get(s.charAt(n-1)+"");
        }
        return ans;
        
        
        
        
    }
}