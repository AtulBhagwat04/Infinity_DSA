class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str=new StringBuilder();

        for(char ch:s.toCharArray()){
            int n=str.length();
            if(n>0&&str.charAt(n-1)==ch){
                str.deleteCharAt(n-1);
            }else{
                str.append(ch);
            }
        }   
        return str.toString();
    }
}