class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(char i:s.toCharArray()){
            if(i=='('){
                st.push(0);
            }else{
               
               int is= st.pop();
               int cur=(is==0)?1:2*is;
               int par=st.pop();
               st.push(cur+par);
            }
        }

        return st.pop();
    }
}