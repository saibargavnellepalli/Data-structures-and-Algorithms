class Solution {
public:
    bool isPalindrome(string s) {
        
        
        return isPal(s);
    }
    
    bool isPal(string s){
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            
            if(isalnum(s[i]) == false) {i++;continue;}
            if(isalnum(s[j]) == false){ j--; continue;}
            
            if(tolower(s[i]) != tolower(s[j])) return false;
            i++;
            j--;
        }
        
        
        return true;
    }
};