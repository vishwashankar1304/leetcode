class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        if(x<10)return true;
        int rem=0;int rev=0;int n=x;
        while(x!=0){
            rem=x%10;x/=10;
            rev=(rev*10)+rem;
        }
       System.out.println(rev);
       return n==rev;
    }
}