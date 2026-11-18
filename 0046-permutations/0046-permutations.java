class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>p=new ArrayList<>();
        boolean[] v=new boolean[nums.length];

        help(nums,ans,p,v);

        return ans;
    }

    static void help(int[] nums,List<List<Integer>>ans,List<Integer>p,boolean[] v){
        if(p.size()==nums.length){
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(v[i])continue;

            p.add(nums[i]);
            v[i]=true;
            help(nums,ans,p,v);
            p.removeLast();
            v[i]=false;
        }
    }

    
}