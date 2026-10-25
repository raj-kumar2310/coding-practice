class Solution {
    public int earliestTime(int[][] tasks) {
        int ans=Integer.MAX_VALUE;

        for(int[] mat:tasks){
            int a=mat[0]+mat[1];

            if(a<ans){
                ans=a;
            }
        }

        return ans;
    }
}