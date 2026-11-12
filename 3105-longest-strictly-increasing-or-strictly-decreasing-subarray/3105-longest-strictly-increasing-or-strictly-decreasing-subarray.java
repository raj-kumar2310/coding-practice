class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int l=1,r=1,ls=Integer.MIN_VALUE,rs=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                l++;
                ls=Math.max(l,ls);
            }else{
                l=1;
            }

            if(nums[i]<nums[i-1]){
                r++;
                rs=Math.max(r,rs);
                
            }else{
                r=1;
            }

        }

        // System.out.println(ls+" "+rs);
        int ans=Math.max(ls,rs);

        if(rs==Integer.MIN_VALUE && ls==Integer.MIN_VALUE)return 1;
        return ans;
    }
}