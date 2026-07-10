class Solution {
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
       return tri(n,dp); 
    }
    public static int tri(int n,int []dp){
        if(n==0 || n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        if(dp[n]!=-1)return dp[n];
        int ans=tri(n-1,dp)+tri(n-2,dp)+tri(n-3,dp);
        dp[n]=ans;
        return ans;
    }
}