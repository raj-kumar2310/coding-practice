class Solution {
    public List<String> letterCombinations(String dig) {
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>l=combination("",dig,map);
        return l;
    }
    static List<String> combination(String p,String up,String[] map){
        if(up.isEmpty()){
            List<String>l=new ArrayList<>();
            // System.out.print(p+" ");
            l.add(p);
            return l;
        }

        int d=up.charAt(0)-'0';
        String str=map[d];

        List<String>ans=new ArrayList<>();

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            ans.addAll(combination(p+ch,up.substring(1),map));
        }

        return ans;
    }
}