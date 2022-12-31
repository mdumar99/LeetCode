class Solution {
public:
    int uniquePathsIII(vector<vector<int>>& grid) {
        int num_zeros = 0, start_row = 0, start_col = 0;
        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid[0].size(); col++) {
                if (grid[row][col] == 0) {
                    num_zeros++;
                } else if (grid[row][col] == 1) {
                    start_row = row;
                    start_col = col;
                }
            }
        }
        return findPaths(grid, start_row, start_col, num_zeros);
    }

    int findPaths(vector<vector<int>>& grid, int row, int col, int num_zeros) {
        if (row < 0 || col < 0 || row >= grid.size() || col >= grid[0].size() || grid[row][col] == -1) {
        return 0;
        }
        if (grid[row][col] == 2) {
            return num_zeros == -1 ? 1 : 0;
        }
        grid[row][col] = -1;
        num_zeros--;
        int total_count = findPaths(grid, row + 1, col, num_zeros) + findPaths(grid, row, col + 1, num_zeros) +
                        findPaths(grid, row - 1, col, num_zeros) + findPaths(grid, row, col - 1, num_zeros);
    grid[row][col] = 0;
        num_zeros++;

        return total_count;
    }    
};





