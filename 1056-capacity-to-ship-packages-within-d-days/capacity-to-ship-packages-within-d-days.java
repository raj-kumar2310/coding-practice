class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,h=0,ans=0;


        for(int i:weights){
            l=Math.max(l,i);
            h+=i;
        }

        while(l<=h){
            int mid=l+(h-l)/2;

            int cap=fun(weights,mid);

            if(cap<=days){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }

        return l;
    }

    static int fun(int[] weights,int cap){
        int day=1,load=0;

        for(int i:weights){
            if(load+i>cap){
                day++;
                load=i;
            }else{
                load+=i;
            }
        }

        return day;
    }
}