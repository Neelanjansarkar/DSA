class Solution {
    public int longestSubarray(int[] arr) {
        int i=0;
        int j=0;
        int f=0;
        int maxlen=-1;
        while(j<arr.length){
            if(arr[j]==0){
                f++;
            }
            while(f>1 && i<=j){
                if(arr[i]==0){
                    f--;
                }
                i++;
            }
            j++;
            maxlen=Math.max(maxlen,j-i);

            
        }
        return maxlen-1;
    }
}