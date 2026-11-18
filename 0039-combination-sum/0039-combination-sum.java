class Solution {
    public List<List<Integer>> combinationSum(int[] can, int t) {
          List<List<Integer>>ans=new ArrayList<>();
          help(0,can,t,ans,new ArrayList<Integer>());
          return ans;
    }

    static void help(int index,int[] can,int t,List<List<Integer>>ans,List<Integer>p){
        if(t==0){
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=index;i<can.length;i++){
            if(can[i] > t || t-can[i] <0)continue;

            p.add(can[i]);
            help(i,can,t-can[i],ans,p);
            p.removeLast();
        }
    }
}