class Solution {

    Integer[][] dp;

    public int uniquePathsWithObstacles(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        dp = new Integer[m][n];

        return countPaths(0, 0, m, n, grid);
    }

    public int countPaths(int i, int j, int m, int n, int[][] grid) {

        if (i >= m || j >= n) return 0;

        if (grid[i][j] == 1) return 0;

        if (i == m - 1 && j == n - 1) return 1;

        if (dp[i][j] != null) return dp[i][j];

        int down = countPaths(i + 1, j, m, n, grid);
        int right = countPaths(i, j + 1, m, n, grid);

        dp[i][j] = down + right;

        return dp[i][j];
    }
}
