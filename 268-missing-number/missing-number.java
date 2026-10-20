class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==n || i==nums[i] )i++;
            else{
                int temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
        }
        for(int j=0;j<n;j++){
            if(j!=nums[j]){
                return j;
            }
        }
        return n;
    }
}
