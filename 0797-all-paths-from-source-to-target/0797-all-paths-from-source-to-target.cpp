class Solution {
public:
    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
        vector<vector<int>> paths;
        vector<int> currentPath;
        currentPath.push_back(0);
        dfs(0, currentPath, graph, graph.size() - 1, paths);
        return paths; 
    }

private:
    void dfs(int currentNode, vector<int>& currentPath, vector<vector<int>>& graph, int targetNode, vector<vector<int>>& paths) {
        if (currentNode == targetNode) {
            paths.push_back(vector<int>(currentPath));
            return;
        }
        for (int nextNode : graph[currentNode]) {
            currentPath.push_back(nextNode);
            dfs(nextNode, currentPath, graph, targetNode, paths);
            currentPath.pop_back();
        }
    }
};