class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i:nums){
            m=Math.min(i,m);
        }

        int moves=0;

        for(int i:nums){
            moves+=i-m;
        }

        return moves;

    }
}