class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        help(ans,"",0,0,n);
        return ans;
    }
    static void help(List<String>ans,String s,int op,int cl,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }

        if(op<n){
            help(ans,s+"(",op+1,cl,n);
        }
        if(cl<op){
            help(ans,s+")",op,cl+1,n);
        }

        //backtrack

        if(s.length() > 0){
        s=s.substring(0,s.length()-1);

        }

    }
}