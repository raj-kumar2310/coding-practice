class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfy=0;

        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
               satisfy+= customers[i];
            }
        }

        int total=satisfy;
        
        int l=0,r=0;
        while(r<customers.length){
            if(grumpy[r]==1){
                satisfy+=customers[r];
            }
            if(r-l+1 >minutes){
                if(grumpy[l]==1){
                    satisfy-=customers[l];
                }
                l++;
            }

            if(r-l+1 ==minutes){
                total=Math.max(total,satisfy);
            }

            r++;
        }

        return total;

    }
}