class Solution {
    public String reverseOnlyLetters(String s) {
        char c[]=s.toCharArray();
        int front=0;
        int rear=s.length()-1;
        while(rear>front){
            if(!Character.isLetter(c[front])){
                front++;
                continue;
            }
            if(!Character.isLetter(c[rear])){
                rear--;
                continue;
            }
            char temp=c[front];
            c[front]=c[rear];
            c[rear]=temp;
            front++;
            rear--;
            }
           String ans=new String(c);
            return ans;
    }
}