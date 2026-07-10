class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
    }
    public static int mincost(int[]arr,int n,int []dp){
        if(n==0 ||n==1){
            return arr[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=arr[n]+Math.min(mincost(arr,n-1,dp),mincost(arr,n-2,dp));
        return dp[n];
    }
}