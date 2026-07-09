class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        return fibo(n,dp);
    }
    public static int fibo(int n,int []dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0) return dp[n];
        int ans=fibo(n-1,dp)+fibo(n-2,dp);
        dp[n]=ans;
        return ans;
    }
}