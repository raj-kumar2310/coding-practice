class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,r=0,sum=0,m=Integer.MIN_VALUE;
        Map<Integer,Integer>map=new HashMap<>();


        while(r<nums.length){
            sum+=nums[r];
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.get(nums[r]) >1){
                sum-=nums[l];
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                l++;
            }

            m=Math.max(m,sum);

            r++;

        }

        return m;
    }
}