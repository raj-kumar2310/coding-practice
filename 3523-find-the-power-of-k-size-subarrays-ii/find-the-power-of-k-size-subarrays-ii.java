class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        if(nums.length==1 || k==1)return nums;

        int c=1;

        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]+1){
                c++;
            }else if(i>0){
                c=1;
            }

            if(i >= k-1){
                if(c>=k){
                    ans[i-k+1]=nums[i];
                }else{

                    ans[i-k+1]=-1;
                }
            }
        }

        return ans;
    }
}