class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int i=0;
        int j=0;
        int sum=0;
        int currlen=Integer.MAX_VALUE;
        while(j<arr.length){
            sum+=arr[j];
            while(sum>=target && i<=j){
                currlen=Math.min(currlen,j-i+1);
                sum-=arr[i];
                i++;
            }
            j++;
        }
        if(currlen==Integer.MAX_VALUE)return 0;
        return currlen;

    }
}