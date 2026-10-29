class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k==0){
            return nums;
        }
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);

        if(nums.length < k)return arr;

        int l=0,r=0;
        long sum=0;
        while(r<nums.length){
            sum+=nums[r];
            if(r-l >2*k){
                sum-=nums[l];
                l++;
            }

            if(r-l == 2*k){
                arr[(r+l)/2]=(int)(sum/(2*k+1));

                // System.out.println(sum+" "+(2*k+1));
            }

            r++;
        }

        return arr;
    }
}