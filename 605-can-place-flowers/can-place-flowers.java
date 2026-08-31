class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int len=arr.length;
        int i=0;
        while(i<len){
            if(n==0){
                return true;
            }
            if(i==0){
                if (len == 1) { if (arr[0] == 0) { n--; arr[0] = 1; } }
                else if(arr[1]!=1 && arr[0]==0){
                    n--;
                    arr[i]=1;
                }
            }
            else if(i==len-1){
                if(arr[len-2]!=1 && arr[i]==0){
                    n--;
                    arr[i]=1;
                }
            }else{
                if(arr[i]==0 && arr[i-1]==0 && arr[i+1]==0){
                    n--;
                    arr[i]=1;
                }
            }
            i++;
        }
        return n==0;
    }
}