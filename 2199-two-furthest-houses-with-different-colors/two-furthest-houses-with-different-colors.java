class Solution {
    public int maxDistance(int[] colors) {
        int ans=0,n=colors.length;

        int i=0,j=1;

        while(i<n){
            if(colors[i] != colors[j]){
                ans=Math.max(ans,j-i);
            }

            // System.out.println(ans);
            if(j!=n-1){
            j++;
            }else{
                i++;
            }



        }

        return ans;
        
    }
}