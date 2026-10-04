class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1,n=nums.length;

        int i=0,j=1;

        while(j<n){

            if(nums[i] < nums[j]){
                ans=Math.max(ans,nums[j]-nums[i]);
            }
            else{
                i=j;
            
            }

            j++;
           

            
        }

        return ans;
    }
}