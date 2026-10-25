class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        double ans=Integer.MAX_VALUE;

        while(i<j){
            double sum=(double)(nums[i]+nums[j])/2;
            System.out.println(sum);
            if(sum<ans)ans=sum;
            i++;j--;
        }

        return ans;
    }
}