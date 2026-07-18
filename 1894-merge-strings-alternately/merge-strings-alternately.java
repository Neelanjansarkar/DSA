class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(i<w1.length() && j<w2.length()){
            ans.append(w1.charAt(i));
            i++;
            ans.append(w2.charAt(j));
            j++;
        }
        while(i<w1.length()){
            ans.append(w1.charAt(i));
            i++;
        }
        while(j<w2.length()){
            ans.append(w2.charAt(j));
            j++;
        }
        return ans.toString();
    }
}