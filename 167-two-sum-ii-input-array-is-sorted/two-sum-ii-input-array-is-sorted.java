class Solution {
    public int[] twoSum(int[] arr, int k) {
        int[]ans=new int[2];
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]+arr[j]==k){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(arr[i]+arr[j]>k){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}