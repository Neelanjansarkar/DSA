class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()){
            return false;
        }
       int i=0;
       int j=0;
       while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
        }
        // if(i<s.length())break;
        j++;
       }
       if(i==s.length()){
        return true;
       } 
       return false;
    }
}