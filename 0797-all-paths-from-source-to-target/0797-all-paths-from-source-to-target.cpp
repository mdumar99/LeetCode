class Solution {
public:
    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
        vector<vector<int>> paths;
        queue<vector<int>> q{{{0}}};
        while(!q.empty()){
            vector<int> path = q.front();
            q.pop();
            int curr = path.back();
            if(curr==graph.size()-1){
                paths.push_back(path);
            }else{
                for(int next : graph[curr]){
                    vector<int> newPath = path;
                    newPath.push_back(next);
                    q.push(newPath);
                }
            }
        }
        return paths;
    }
    
};

