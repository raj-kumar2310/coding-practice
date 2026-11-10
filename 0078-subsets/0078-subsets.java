class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        helper(nums,0,ans,l);
        return ans;
    }

    static void helper(int[] nums,int i,List<List<Integer>>ans,List<Integer>l){
        if(i==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[i]);
        helper(nums,i+1,ans,l);
        l.remove(l.size()-1);
        helper(nums,i+1,ans,l);

    }
}