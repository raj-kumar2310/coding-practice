class Solution {
    public int subsetXORSum(int[] nums) {
        return help(nums,0,0);
    }
    static int help(int[] arr,int xor,int i){
        if(i==arr.length){
            return xor;
        }

        // System.out.println()
        int ans=help(arr,arr[i]^xor,i+1)+help(arr,xor,i+1);

        return ans;
    }
}