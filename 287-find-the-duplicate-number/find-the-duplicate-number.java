class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==nums[nums[i]]){
                return nums[i];
            }
            if(i!=nums[i]){
                swap(i,nums);
            }
        }
        return -1;
    }
    public void swap(int i,int[]arr){
        int temp=arr[i];
        arr[i]=arr[temp];
        arr[temp]=temp;
    }
}