class Solution {
    public int numOfSubarrays(int[] arr, int k, int x) {
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if((sum/k)>=x) c++;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if((sum/k)>=x) c++;
        }
        return c;

    }
}