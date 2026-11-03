class Solution {
    public int[] resultsArray(int[] nums, int k) {

        if(nums.length==1 || k==1)return nums;
        int[] ans=new int[nums.length - k +1];
        
        Arrays.fill(ans,-1);

        for(int i=0;i<=nums.length-k;i++){
            boolean f=true;
            int m=Integer.MIN_VALUE;

            for(int j=i+1;j<k+i;j++){
                if(nums[j-1]+1 == nums[j]){
                    m=Math.max(m,nums[j]);
                }else{
                    f=false;
                    break;
                }
            }

            if(f){
                ans[i]=m;
            }

        }

        return ans;
    }
}