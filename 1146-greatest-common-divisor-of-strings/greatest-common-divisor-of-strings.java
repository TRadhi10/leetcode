class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        else{
            int len1=str1.length();
            int len2=str2.length();
            int gcdlength=gcd(len1,len2);
            return str1.substring(0, gcdlength);
        }
    }
        public static int  gcd(int len1,int len2){
            while(len2!=0){
                 int temp=0; 
                 temp=len2;
                 len2=len1%len2;
                 len1=temp;
        }
        return len1;
        }
}
