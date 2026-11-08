class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] pfx=new int[arr.length];
        pfx[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pfx[i]=pfx[i-1]+arr[i];
        }
        map.put(0,1);
        int ans=0;
        for(int i=0;i<arr.length;i++){
             int diff=pfx[i]-k;
             ans+=map.getOrDefault(diff,0);
             map.put(pfx[i],map.getOrDefault(pfx[i],0)+1);
        }
        return ans;
    }
}