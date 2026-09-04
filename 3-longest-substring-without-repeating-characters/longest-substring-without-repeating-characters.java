class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int ans=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
            while(map.get(ch)>1 && i<=j){
                // if()
                if(map.get(s.charAt(i))==1){
                    map.remove(s.charAt(i));
                }else{
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                }
                i++;
                
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}