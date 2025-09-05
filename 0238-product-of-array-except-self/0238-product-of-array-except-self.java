class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        if(n==2)return new int[] {arr[1],arr[0]};
         int[] pre = new int[n];
        int[] pos = new int[n];
         Arrays.fill(pre,1);
        Arrays.fill(pos,1);
        pre[0]=arr[0];
         for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*arr[i];
        }
        pos[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            pos[i]=pos[i+1]*arr[i];
        }
        int[] res=new int[n];
        res[0]=pos[1];
        res[n-1]=pre[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=pre[i-1]*pos[i+1];
        }
        for(int i=0;i<n;i++)System.out.print(res[i]+" ");
        return res;

    }
}