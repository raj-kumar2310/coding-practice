class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ansIn=0,m=0;

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


         

        return new int[]{ansIn,m};  
    }
}