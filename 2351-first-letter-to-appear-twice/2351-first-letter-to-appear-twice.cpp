class Solution {
public:
    char repeatedCharacter(string s) {
        
        unordered_map<char, int> map;
        
        for(int i=0; i<s.length(); i++){
            map[s[i]]++;
            
            if(map[s[i]] == 2) return s[i];
        }
        
        return 'p';
    }
};