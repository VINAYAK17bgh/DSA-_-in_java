class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            int front=i;
            int back= s.length-1-i;
            char temp=s[front];
            s[front]=s[back];
            s[back]=temp;
        }
    }
}