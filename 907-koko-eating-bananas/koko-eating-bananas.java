class Solution {
    public int minEatingSpeed(int[] arr, int hr) {
        int l=1,h=Integer.MIN_VALUE;

        for(int i:arr){
            h=Math.max(i,h);
        }

        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int mid=l+(h-l)/2;

            long a=fun(arr,mid);

            if(a<=hr){
                ans=Math.min(ans,mid);
                h=mid-1;
            }else{
                l=mid+1;
            }
            
        }

        return ans;
    }

    static long fun(int[] arr,int n){
        long ans=0;

        for(int i:arr){
            ans+=(int)Math.ceil((double)i/n);
        }

        return ans;
    }
}