class Solution {
    public int pivotInteger(int n) {
        // if(n==1)return 1;

        int l=1,h=n;
        int tot=0,sum=0;

       for(int i=l;i<=h;i++)tot+=i;

       for(int i=l;i<=h;i++){
        if((tot-i)==sum*2 )return i;
        sum+=i;
       }

        return -1;

    }
}