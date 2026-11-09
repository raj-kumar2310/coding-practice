class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>out=new ArrayList<>();
        out.add(new ArrayList());
        int st=0,en=0;

        for(int i=0;i<nums.length;i++){
            st=0;
            if(i>0 && nums[i-1]==nums[i]){
                st=en+1;
            }

            en=out.size()-1;
            int n=out.size();
            for(int j=st;j<n;j++){
                List<Integer>iner=new ArrayList<>(out.get(j));
                iner.add(nums[i]);
                out.add(iner);
            }
        }
     
        return out;
    }
}