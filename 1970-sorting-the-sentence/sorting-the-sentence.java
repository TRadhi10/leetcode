class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String string1[]=new String[str.length];
        for(int i=0;i<str.length;i++){
            int n=str[i].charAt(str[i].length()-1)-'0';
            string1[n-1]=str[i].substring(0,str[i].length()-1);
        }
        return String.join(" ",string1);
    }
}