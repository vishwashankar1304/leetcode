class Solution {
    public int compress(char[] chars) {
        String code ="";
        char ptr=chars[0];
        int run = 0 ;
        for(char ch : chars){
            if(ch==ptr){
                run+=1;
            }
            else{
                code+=ptr+(run>1?""+run:"");
                ptr=ch;
                run=1;
            }
        }
        code+=ptr+(run>1?""+run:"");
       // System.out.println(code);
        for(int i=0;i<code.length();i++){
            chars[i]=code.charAt(i);
        }
        return code.length();
    }
}