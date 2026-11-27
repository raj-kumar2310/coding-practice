class Solution {
    public boolean canAliceWin(int n) {
        if(n <=9)return false;
        boolean ans=false;
        int i=10;

        while(n >=i){
            n=n-i;
            ans=!ans;
            i--;
        }

        return ans;
    }
}