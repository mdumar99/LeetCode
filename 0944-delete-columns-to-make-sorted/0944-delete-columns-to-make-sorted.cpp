class Solution {
public:
    int minDeletionSize(vector<string>& strs) {
        int count = 0;
        for(int i=0; i<strs[0].length(); i++){
            vector<char> cl;
            for(int j=0; j<strs.size(); j++){
                cl.push_back(strs[j][i]);
            }
            if(!std::is_sorted(cl.begin(), cl.end())){
                count++;
            }
        }
        
        return count;
    }
};

