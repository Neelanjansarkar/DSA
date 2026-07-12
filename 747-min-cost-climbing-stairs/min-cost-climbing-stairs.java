class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(stairs(cost,0,dp),stairs(cost,1,dp));
    }
    public static int stairs(int[]arr,int i,int[]dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int a=arr[i]+stairs(arr,i+1,dp);
        int b=arr[i]+stairs(arr,i+2,dp);
        return dp[i]=Math.min(a,b);


    }
}