class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return paths(0,0,m,n,dp);
    }
    public int paths(int i,int j,int m,int n,int[][]dp){
        if(i>=m ||j>=n)return 0;
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int leftways=paths(i+1,j,m,n,dp);
        int rightways=paths(i,j+1,m,n,dp);
        return dp[i][j]=leftways+rightways;
    }
}