class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        help(1,n,k,ans,new ArrayList<Integer>());
        return ans;
    
    }

    static void help(int st,int n,int k,List<List<Integer>>ans,List<Integer>l){
        if(l.size()==k){
            ans.add(new ArrayList<>(l));
            return;
        }

        for(int i=st;i<=n;i++){
            l.add(i);
            help(i+1,n,k,ans,l);
            l.remove(l.size()-1);
        }
    }
}