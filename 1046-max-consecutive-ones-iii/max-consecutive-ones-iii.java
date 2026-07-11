class Solution {
    public int longestOnes(int[] arr, int k) {
        int flip=0;
        int i=0;
        int j=0;
        int maxlen=-1;
        while(j<arr.length){
            if(arr[j]==0){
                flip++;
            }
            while(flip>k && i<=j){
                if(arr[i]==0){
                    flip--;
                }
                i++;
            }
            j++;
            maxlen=Math.max(maxlen,j-i+1);

        }
        return maxlen-1;

    }
}