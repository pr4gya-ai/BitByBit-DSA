class Solution {
    Integer[][] dp;

    public int uniquePaths(int m, int n) {

        dp = new Integer[m][n];

        return countPaths(0, 0, m, n);
    }

    public int countPaths(int i, int j, int m, int n) {
        if (i >= m || j >= n) return 0;
        if (i == m - 1 && j == n - 1) return 1;
        if (dp[i][j] != null) return dp[i][j];

        int down = countPaths(i + 1, j, m, n);
        int right = countPaths(i, j + 1, m, n);

        dp[i][j] = down + right;

        return dp[i][j];
    }
}
