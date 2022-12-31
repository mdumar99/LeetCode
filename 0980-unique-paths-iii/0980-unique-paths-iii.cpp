class Solution {
public:
    int uniquePathsIII(vector<vector<int>>& grid) {
        int numRows = grid.size(), numCols = grid[0].size(), startRow = 0, startCol = 0, remainingSpaces = 1, result = 0;
        for (int row = 0; row < numRows; ++row) {
            for (int col = 0; col < numCols; ++col) {
                if (grid[row][col] == 1) {
                    startRow = row; startCol = col;
                } else if (grid[row][col] == 0) {
                    ++remainingSpaces;
                }
            }
        }
        findPaths(grid, remainingSpaces, startRow, startCol, result);
            return result;
        }
    void findPaths(vector<vector<int>>& grid, int& remainingSpaces, int row, int col, int& result) {
        int numRows = grid.size(), numCols = grid[0].size();
        if (row < 0 || row >= numRows || col < 0 || col >= numCols || grid[row][col] < 0) return;
        if (grid[row][col] == 2) {
            if (remainingSpaces == 0) ++result;
            return;
        }
        grid[row][col] = -2;
        --remainingSpaces;
        findPaths(grid, remainingSpaces, row + 1, col, result);
        findPaths(grid, remainingSpaces, row - 1, col, result);
        findPaths(grid, remainingSpaces, row, col + 1, result);
        findPaths(grid, remainingSpaces, row, col - 1, result);
        grid[row][col] = 0;
        ++remainingSpaces;
    }
};












