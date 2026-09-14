class Solution {
    public int countEven(int num) {
        int ans=0;

        for(int i=2;i<=num;i++){
            int t=i;
            int rem=0;
        while(t>0){
            rem+=t%10;
            t/=10;
        }

        if(rem%2==0)ans++;


        }

        return ans;
    }
}