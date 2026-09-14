class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>l=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int low=nums[0];
        int hi=nums[0];

        for(int i: nums){
            l.add(i);
            if(i>hi)hi=i;
            if(i<low)low=i;
        }

        for(int i=low;i<=hi;i++){
            if(!l.contains(i))ans.add(i);
        }

        return ans;
    }
}