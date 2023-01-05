class Solution {
public:
    int findMinArrowShots(vector<vector<int>>& points) {
        if (points.empty()) {
            return 0;
        }
        sort(points.begin(), points.end());
        int pos = points[0][1];
        int count = 1;
        for (auto p : points) {
            if (p[0] > pos) {
                count++;
                pos = p[1];
            }
            pos = min(p[1], pos);
        
        }
        return count;
    }
};