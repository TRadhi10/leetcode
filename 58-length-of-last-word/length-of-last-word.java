class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        char[] c=s.toCharArray();
       for(int i=s.length()-1;i>=0;i--){
              if(c[i]== 32){
                break;
              }
              else{
                count++;
              }
       }
       return count;
    }
}