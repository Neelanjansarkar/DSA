class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(i==arr[i] ||arr[i]==arr.length)i++;
            else{
                swap(i,arr[i],arr);
            }
        }
        for(int k=0;k<arr.length;k++){
            if(k!=arr[k]){
                return k;
            }
        }
        return arr.length;
        }
    public static void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[temp];
        arr[temp]=temp;
    }    
        
    }
    