class Solution {
public:
    bool isPalindrome(string s) {
        
        string ans;
        
        for(int i=0; i<s.length(); i++){
            if(s[i] >= 'a' && s[i] <='z'){
                ans.push_back(s[i]);
            }
            else  if(s[i] >= 'A' && s[i] <='Z'){
                ans.push_back(tolower(s[i]));
            }
            if(s[i] >= '0' && s[i] <= '9'){
                ans.push_back(s[i]);
            }
        }
        
        cout << ans;
        return isPal(ans);
        
    }
    
    bool isPal(string s){
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            if(s[i] != s[j]) return false;
            i++;
            j--;
        }
        
        
        return true;
    }
};