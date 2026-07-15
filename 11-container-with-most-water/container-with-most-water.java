class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int area=0;
        while(i<j){
            int height=Math.min(arr[i],arr[j]);
            int width=j-i;
            area=Math.max(area,height*width);
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;

    }
}