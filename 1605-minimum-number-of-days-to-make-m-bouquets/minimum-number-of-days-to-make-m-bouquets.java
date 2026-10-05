class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l=Integer.MAX_VALUE,r=-1;
        for(int i:bloomDay){
            l=Math.min(i,l);
            r=Math.max(r,i);
        }

        int ans=-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(fun(bloomDay,m,k,mid)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }


        }

        return ans;
    }

    static boolean fun(int[] arr,int m,int k,int day){
        int c=0,nb=0;
        for(int i:arr){
            if(day>=i){
                c++;
            }else{
                nb+=c/k;
                c=0;
            }
        }
        
        nb+=c/k;

        return nb>=m;
    }
}