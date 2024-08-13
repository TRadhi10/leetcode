class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        int n=a.length();
        int m=b.length();
        if(n>m){
            return n;
        }
        else{
            return m;
        } 
    }
}