class Solution {
    public int maxProductDifference(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i:nums){
            if(min1>i){
                min2=min1;
                min1=i;
            }else if(min2 > i){
                min2=i;
            }
            if(max1<i){
                max2=max1;
                max1=i;
            }else if(max2 < i){
                max2=i;
            }

        }

        return (max1*max2)-(min1*min2);
    }
}