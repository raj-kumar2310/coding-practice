class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>p=new ArrayList<>();
        boolean[] v=new boolean[nums.length];
        help(0,nums,ans,p,v);

        return ans;
    }

    static void help(int index,int[] nums,List<List<Integer>>ans,List<Integer>p,boolean[] v){
        if(index==nums.length){
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(v[i])continue;
            if(i > 0 && nums[i]==nums[i-1] && !v[i-1])continue;
            v[i]=true;
            p.add(nums[i]);
            help(index+1,nums,ans,p,v);
            p.removeLast();
            v[i]=false;
        }
    }
}