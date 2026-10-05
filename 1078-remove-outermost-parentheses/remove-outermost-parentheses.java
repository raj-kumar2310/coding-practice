class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int open=0;

        for(char i:s.toCharArray()){
            if(i=='('){
                if(open>0)ans.append(i);
             open++;
            }
            if(i==')'){
             open--;
                if(open>0)ans.append(i);
            }

        }

        return ans.toString();
    }
}