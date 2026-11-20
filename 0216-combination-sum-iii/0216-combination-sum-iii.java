class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>p=new ArrayList<>();
        help(1,n,k,ans,p);

        return ans;
    }

    static void help(int index,int t,int k,List<List<Integer>>ans,List<Integer>p){
        if(p.size()==k){
            if(t==0){
                ans.add(new ArrayList<>(p));
            }

            return;
        }

        for(int i=index;i<=9;i++){
            if(i<=t){
                p.add(i);
                help(i+1,t-i,k,ans,p);
                p.removeLast();
            }else{
                return;
            }
        }
    }
}