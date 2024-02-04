class Solution {
public:
    bool isAnagram(string s, string t) {
        
         sort(s.begin(), s.end());
         sort(t.begin(), t.end());
        
        cout  << s << endl;
        cout << t << endl;
        
        int n1 = s.length();
        int n2 = t.length();
        
        
        if(n1 != n2) return false;
        
        int i=0, j=0;
        
        while(i<n1){
            
            if(s[i] != t[j]) return false;
            
            i++;
            j++;
        }
        
        return true;
    }
};