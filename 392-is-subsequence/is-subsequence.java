class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1=s.length();
        int t1=t.length();
        int s1Index=0;
        int t1Index=0;
        while(s1Index<s1  && t1Index<t1){
            if(s.charAt(s1Index)==t.charAt(t1Index)){
                         s1Index++;
            }
            t1Index++;
        }
        return s1Index==s1;
    }
}