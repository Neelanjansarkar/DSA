class Solution {
    public class pair implements Comparable<pair>{
        int ele;
        int dist;
        pair(int ele,int dist){
            this.ele=ele;
            this.dist=dist;
        }
        public int compareTo(pair p){
            if(this.dist==p.dist){
                return this.ele-p.ele;
            }
            return this.dist-p.dist;
        }
    } 
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans =new ArrayList<>();
        PriorityQueue<pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int d=Math.abs(arr[i]-x);
            pq.add(new pair(arr[i],d));
            if(pq.size()>k){
                pq.remove();
            }
        }
        while(!pq.isEmpty()){
            pair pa=pq.remove();
            ans.add(pa.ele);
        }
        Collections.sort(ans);
        return ans;

    }
}