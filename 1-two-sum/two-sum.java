class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int[] ans={-1,-1};
        for(int i=0;i<arr.length;i++){
            int ele=target-arr[i];
            if(!map.containsKey(ele)){
                map.put(arr[i],i);
            }else{
                ans[0]=map.get(ele);
                ans[1]=i;
            }
        }
        return ans;
    }
}