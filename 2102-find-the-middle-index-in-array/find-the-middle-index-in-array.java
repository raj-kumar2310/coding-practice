class Solution {
    public int findMiddleIndex(int[] nums) {
        int tot=0,sum=0;

        for(int i:nums)tot+=i;

        for(int i=0;i<nums.length;i++){
            if(tot-(sum+nums[i]) == sum ){
                return i;
            }else{
                sum+=nums[i];
            }
        }

        return -1;
    }
}