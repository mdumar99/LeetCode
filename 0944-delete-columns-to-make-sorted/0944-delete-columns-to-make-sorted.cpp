class Solution {
public:
    int minDeletionSize(vector<string>& strs) {
        int count = 0;
        for(int i=0; i<strs[0].length(); i++){
            char prev = strs[0][i];
            for(int j=1; j<strs.size(); j++){
                if(strs[j][i]<prev){
                    count++;
                    break;
                }
                
                prev = strs[j][i];
            }
        }
        
        return count;
    }
};

