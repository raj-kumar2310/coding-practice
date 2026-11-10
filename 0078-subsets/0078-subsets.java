class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>out=new ArrayList<>();
        out.add(new ArrayList<>());
        for(int i:nums){
            int n=out.size();
            for(int j=0;j<n;j++){
                List<Integer>iner=new ArrayList<>(out.get(j));
                iner.add(i);
                out.add(iner);
            }
        }

        return out;
    }
}