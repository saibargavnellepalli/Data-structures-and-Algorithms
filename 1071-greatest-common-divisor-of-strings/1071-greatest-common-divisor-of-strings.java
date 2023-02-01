class Solution {
    public String gcdOfStrings(String str1, String str2) {
            int str1Len = str1.length();
            int str2Len = str2.length();

            // define a helper function
       
        Function<Integer,Boolean> gcdOfStringsHelper = (len) ->{
            //the longest possible string (which is min of both) should be multiple of both strings else its aborted
            if(str1Len % len !=0  || str2Len % len !=0  ) return Boolean.FALSE;
            // get the repeating count
            int str1Factor = str1Len/len;
            int str2Factor = str2Len/len;
            
            //str.repeat(count) regenerates str for count times. 
            // using this we can check if str1 is able to get generated from str[:len] substring for str1Factor times and same for Str2
            return str1.equals(str1.substring(0,len).repeat(str1Factor)) &&
                    str2.equals(str1.substring(0,len).repeat(str2Factor));

        };


        //find the smallest len string and try to figure if that satifies gcd criteria
        for(int len= Math.min(str1Len,str2Len); len>0; len--)
        {
            if(gcdOfStringsHelper.apply(len))
                return str1.substring(0,len);
        }
        return "";
    }   
}
