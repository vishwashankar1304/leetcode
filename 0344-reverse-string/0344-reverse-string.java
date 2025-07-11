class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char ptr1=s[0];
        char ptr2=s[n-1];
        for(int i=0;i<n/2;i++){
            char ptr=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=ptr;
        }

    }
}