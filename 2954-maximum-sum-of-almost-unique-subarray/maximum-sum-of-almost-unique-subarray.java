 class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        long sum=0;
        int l=0,r=0;
        long ans=0;
        while(r<nums.size()){
            sum+=nums.get(r);
            map.put(nums.get(r),map.getOrDefault(nums.get(r),0)+1);

            if(r-l+1 > k){
            sum-=nums.get(l);
            map.put(nums.get(l),map.getOrDefault(nums.get(l),0)-1);
            if(map.get(nums.get(l))==0){
                map.remove(nums.get(l));
            }

            l++;

            }

            if(r-l+1 == k && map.size()>=m){
                ans=Math.max(ans,sum);
            }

            r++;
        }

        return ans;
    }
} 