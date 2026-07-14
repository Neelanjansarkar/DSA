class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int len=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }else{
                map.put(ch,1);
            }
            while(map.get(ch)>1 && i<=j){
                char left = s.charAt(i);
                map.put(left, map.get(left)-1);
                if(map.get(left)==0){
                map.remove(left);
            }
                i++;
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}