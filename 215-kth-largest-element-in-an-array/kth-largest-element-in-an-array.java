class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:nums){
            pq.add(ele);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int ans=pq.remove();
        return ans;
    }
}