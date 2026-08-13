class Solution {
    String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> fans =new ArrayList<>();
        int i=0;
        print(digits,i,fans,"");
        return fans;
    }
    public void print(String digits,int j,List<String> fans,String ans){
        if(j==digits.length()){
            fans.add(ans);
            return;
        }
        int d=digits.charAt(j)-'0';
        String map=arr[d];
        for(int i=0;i<map.length();i++){
            char ch=map.charAt(i);
            print(digits,j+1,fans,ans+ch);
        }
    }
}