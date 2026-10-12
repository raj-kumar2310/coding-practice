class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1,h=0;

        for(int i:nums){
            h=Math.max(h,i);
        }

        while(l<=h){
            int mid=l+(h-l)/2;

            if(fun(nums,mid,threshold)){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }

        return l;
    }

    static boolean fun(int[] arr,int div,int th){
        int sum=0;

        for(int i:arr){
            sum+=Math.ceil((double)i/div);
        }

        return sum<=th;
    }
}