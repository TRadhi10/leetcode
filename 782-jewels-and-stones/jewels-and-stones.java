class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] je=new char[jewels.length()];
        for(int i=0;i<jewels.length();i++){
            je[i]=jewels.charAt(i);
        }
        char[] s=new char[stones.length()];
        for(int i=0;i<stones.length();i++){
              s[i]=stones.charAt(i);
        }
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(je[i]==s[j]){
                   count++;
                }
            }
        }
        return count;
    }
}