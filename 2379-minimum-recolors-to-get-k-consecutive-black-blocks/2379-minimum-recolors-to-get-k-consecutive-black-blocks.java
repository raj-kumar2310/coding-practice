class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=Integer.MAX_VALUE;
        int i=0,r=0,w=0;

        while(r<blocks.length()){
            
            if(blocks.charAt(r)=='W'){
                w++;
            }

            while(r-i+1 > k){
            System.out.println(w+" "+(r-i+1));
                if(blocks.charAt(i)=='W')w--;
                i++;
            }
            if(r-i+1==k){
                ans=Math.min(ans,w);
            }

            r++;
        }

        return ans;
    }
}