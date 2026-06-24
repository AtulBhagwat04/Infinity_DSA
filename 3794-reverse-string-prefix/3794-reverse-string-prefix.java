class Solution {
    public String reversePrefix(String s, int k) {
        char[] ch=s.toCharArray();

        for(int i=0;i<k/2;i++){
            char temp=ch[i];
            ch[i]=ch[k-1-i];
            ch[k-1-i]=temp;
        }

        return new String(ch);
    }
}