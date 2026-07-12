class Solution {
    public int largestRectangleArea(int[] arr) {
        int maxarea = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= arr.length; i++) {

            int temp;
            if (i == arr.length) {
                temp = 0;
            } else {
                temp = arr[i];
            }

            while (st.size() > 0 && temp < arr[st.peek()]) {

                int ele = arr[st.pop()];
                int nser = i;
                int nsel = st.size() == 0 ? -1 : st.peek();

                int x1 = nsel + 1;
                int x2 = nser - 1;

                maxarea = Math.max(maxarea, (x2 - x1 + 1) * ele);
            }

            st.push(i);
        }

        return maxarea;
    }
}