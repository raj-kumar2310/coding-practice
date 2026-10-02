class Solution {
    public int splitArray(int[] nums, int k) {
        int st=0,en=0;
        
        for(int i=0;i<nums.length;i++){
            st=Math.max(st,nums[i]);
            en+=nums[i];
        }

        while(st<en){
            int p=1;
            int sum=0;
            int mid=st+(en-st)/2;

            for(int i:nums){
                if(sum+i>mid){
                    sum=i;
                    p++;
                }else{
                    sum+=i;
                }
            }

            if(p>k){
                st=mid+1;
            }else{
                en=mid;
            }
        }

        return en;
    }
}