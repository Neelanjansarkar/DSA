class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        int n=arr.length;
        while(i<n){
            if(arr[i]>n || arr[i]<=0){
                i++;
            }else if(i==arr[i]-1){
                i++;
            }else if(arr[i] == arr[arr[i] - 1]) {
    i++;
}
            else{
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
}