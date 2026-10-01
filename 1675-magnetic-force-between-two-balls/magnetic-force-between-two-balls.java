class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        // for(int i:position)System.out.println(i);

        int l=0,h=position[position.length-1]-position[0];

        while(l<=h){
            int mid=l+(h-l)/2;

            if(fun(position,m,mid)){
                l=mid+1;
            }else{
                h=mid-1;
            }


        }

        return h;
    }

    static boolean fun(int[] position,int m,int dis){
        int step=1,last=position[0];

        for(int i=1;i<position.length;i++){
            if(position[i]-last>=dis){
                step++;
                last=position[i];
            }
        }

        return step>=m;
    }
}