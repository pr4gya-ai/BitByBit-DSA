class Solution {
    Integer[][] dp;

    public int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        dp = new Integer[n][m];

        return minPath(0, 0, m, n, grid);

    }
    
    public int minPath(int i, int j, int m, int n, int[][] grid){
        if(i==n || j==m) return Integer.MAX_VALUE;
        if(i==n-1 && j==m-1) return grid[n-1][m-1];
        if(dp[i][j] !=null) return dp[i][j];
        int r= minPath(i, j+1, m, n, grid);
        int d= minPath(i+1, j, m, n, grid);
        return dp[i][j] = grid[i][j] + Math.min(r, d);
    }
}