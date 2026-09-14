class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans=new int[2];
        int ansIn=0,m=Integer.MIN_VALUE;

        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }

            if(m<count){
            m=count;
            ansIn=i;
            }
        }  


        ans[0]=ansIn;      
        ans[1]=m;

        return ans;      
    }
}