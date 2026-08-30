class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int pr=1;
        int c=0;
        int i=0;
        int j=0;
        while(j<arr.length){
            pr=pr*arr[j];
            while(pr>=k && i<=j){
                pr=pr/arr[i];
                i++;
            }
            c+=j-i+1;
            j++;
        }
        return c;
    }
}