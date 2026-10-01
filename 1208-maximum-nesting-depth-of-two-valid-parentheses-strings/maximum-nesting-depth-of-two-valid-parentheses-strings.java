class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans=new int[seq.length()];
        int c=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                ans[i]=c%2;
                c++;
            }else{
                c--;
                ans[i]=c%2;
            }
        }

        return ans;
    }
}