class Solution {
    public int maxDepth(String s) {
        int ans=0,c=0;

        for(char i:s.toCharArray()){
            if(i==')'){
                c++;
            }else if(i=='('){
                if(c>0)c--;
            }
        }

        return c;
    }
}