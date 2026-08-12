class Solution {
    public class pair implements Comparable<pair>{
        int x;
        int f;
        pair(int x,int f){
            this.x=x;
            this.f=f;
        }
        public int compareTo(pair p){
            return this.f-p.f;
        }
    }
    public int[] topKFrequent(int[] arr, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
            map.put(ele,1);
            }
        }
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            pq.add(new pair(ele,freq));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int idx=0;
        while(!pq.isEmpty()){
            pair pa=pq.remove();
            ans[idx++]=pa.x;
        }
        return ans;
    }
}