class Solution {
    public int trap(int[] arr) {
        int[]prmax=new int [arr.length];
        int[]sfxmax=new int [arr.length];
        prmax[0]=arr[0];
        sfxmax[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            prmax[i]=Math.max(arr[i],prmax[i-1]);
        }
        for(int i=arr.length-2;i>0;i--){
            sfxmax[i]=Math.max(sfxmax[i+1],arr[i]);
        }
        int i=1;
        int unit=0;
        while(i<arr.length-1){
            int lb=prmax[i-1];
            int rb=sfxmax[i+1];
            int contri=Math.min(lb,rb)-arr[i];
            if(contri<=0){
                unit+=0;
            }else{
                unit+=contri;
            }
            i++;

        }
        return unit;

    }
}