class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr=new int[code.length];

        if(k>0){
            int sum=0;
            for(int i=0;i<=k;i++){
                sum+=code[i];
            }
            int end=k;

            for(int i=0;i<code.length;i++){
                sum-=code[i];
                arr[i]=sum;
                end++;
                if(end==code.length){
                    end=0;
                }
                sum+=code[end];
            }

        }


        if(k<0){
            k=Math.abs(k);
            int sum=0;
            for(int i=code.length-k;i<code.length;i++){
                sum+=code[i];
            }
            int start=code.length-k, end=code.length-1;

            for(int i=0;i<code.length;i++){
                arr[i]=sum;
                sum-=code[start];
                start++;
                if(start==code.length)start=0;
                end++;
                if(end==code.length)end=0;
                sum+=code[end];

            }

        }

        return arr;
    }
}