class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l =Integer.MAX_VALUE;
        long ans=0;

        for (int i : time) {

            l=Math.min(l,i);
        }
        long h=l*totalTrips;

        while(l<=h){
            long mid=l+(h-l)/2;

            if(fun(time,mid,totalTrips)){
                h=mid-1;
                ans=mid;
            }else{
                l=mid+1;
            }
        }

        return ans;
    }

    static boolean fun(int[] arr, long time, int tt) {
        long ans = 0;

        for (int i : arr) {
                ans += time/i;
                if(ans>=tt)return true;
          }

        return ans >= tt;
    }
}