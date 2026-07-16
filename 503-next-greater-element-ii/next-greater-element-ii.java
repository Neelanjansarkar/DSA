class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[] ans=new int[arr.length];
        Arrays.fill(ans,-1);
        Stack <Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans[st.pop()] = arr[i];
            }
        }
        return ans;
    }
}