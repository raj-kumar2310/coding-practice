class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>p=new ArrayList<>();
        help(0,s,ans,p);
        return ans;
    }

    static void help(int index,String s,List<List<String>>ans,List<String>p){
        if(index==s.length()){
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(palin(s,index,i)){
                
                p.add(s.substring(index,i+1));
                help(i+1,s,ans,p);
                p.removeLast();
                
            }
        }
    }

    static boolean palin(String s,int st,int en){
        while(st<=en){
            if(s.charAt(st++) != s.charAt(en--)){
                return false;
            }
        }
        

        return true;
    }
}