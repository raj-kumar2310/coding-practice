class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int d=0;
            int a=nums[i];

            while(a>0){
                d+=a%10;
                a/=10;
            }


            if(d==i)return i;
            
        }

        return -1;
    }
}