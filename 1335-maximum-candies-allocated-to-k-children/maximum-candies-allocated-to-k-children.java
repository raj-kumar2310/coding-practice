class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1,h=Integer.MIN_VALUE;

        for(int i:candies){
            h=Math.max(h,i);
        }

        int ans=Integer.MAX_VALUE;

        while(l<=h){
            int mid=l+(h-l)/2;

            if(fun(candies,mid) >=k){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }

        return h;
    }

    static long fun(int[] arr,int c){
        long t=0;

        for(int i:arr){
            t+=i/c;
        }
        // System.out.println(t);
        return t;
    }
}