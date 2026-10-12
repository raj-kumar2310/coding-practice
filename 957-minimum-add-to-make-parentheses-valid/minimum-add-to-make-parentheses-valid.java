class Solution {
    public int minAddToMakeValid(String s) {
        int op=0,minreq=0;

        for(char i:s.toCharArray()){
            if(i=='('){
                op++;
            }else{
                if(op==0)minreq++;
                else op--;

            }
        }

        return Math.abs(op+minreq);
    }
}