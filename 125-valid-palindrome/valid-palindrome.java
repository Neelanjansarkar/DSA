class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        for(char ch:s.toCharArray()){
            if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                ans+=Character.toLowerCase(ch);
            }
        }
        int i=0;
        int j=ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}