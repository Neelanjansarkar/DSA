class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return Math.max(robh(0,nums,dp),robh(1,nums,dp));
    }
    public int robh(int i,int[] arr,int[]dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1)return dp[i];
        int take=arr[i]+robh(i+2,arr,dp);
        int notake=robh(i+1,arr,dp);
        return dp[i] =Math.max(take,notake);
    }
}