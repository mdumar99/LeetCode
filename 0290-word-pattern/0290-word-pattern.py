class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ");
        if len(words) != len(pattern):
            return False
        
        cwMapping = {}
        wcMapping = {}
        
        for i in range(len(pattern)):
            char = pattern[i];
            word = words[i];
            
            if char not in cwMapping:
                cwMapping[char] = word
            
            if word not in wcMapping:
                wcMapping[word] = char
                
            if cwMapping[char] != word or wcMapping[word] != char:
                return False
        
        return True