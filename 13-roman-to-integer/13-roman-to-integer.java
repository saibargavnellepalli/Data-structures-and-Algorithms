class Solution {
    public int romanToInt(String s) {
        
        int i=s.length()-1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
        
        int ans = 0;
        while(i > 0){
            char ch = s.charAt(i);
            if(s.charAt(i-1)=='I' && s.charAt(i)=='V'){
                ans += 4;
                i--;
            }
            else if(s.charAt(i-1)=='I' && s.charAt(i)=='X'){
                ans += 9;
                i--;
            }
             else if(s.charAt(i-1)=='X' && s.charAt(i)=='L'){
                ans += 40;
                i--;
            }
             else if(s.charAt(i-1)=='X' && s.charAt(i)=='C'){
                ans += 90;
                i--;
            }
             else if(s.charAt(i-1)=='C' && s.charAt(i)=='D'){
                ans += 400;
                i--;
            }
             else if(s.charAt(i-1)=='C' && s.charAt(i)=='M'){
                ans += 900;
                i--;
            }
            else{
           ans += map.get(s.charAt(i));
            }
            i--;
            
        }
        if(i==0){
            char ch = s.charAt(i);
             ans += map.get(s.charAt(i));
        }
        return ans;
    }
}