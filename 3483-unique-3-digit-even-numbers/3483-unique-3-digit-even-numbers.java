class Solution {
    public int totalNumbers(int[] d) {
         Set<Integer>set=new TreeSet<>();
        boolean[] visit=new boolean[d.length];

        help(0,0,visit,set,d);

       return set.size();
    }
    static void help(int index,int sum,boolean[] visit,Set<Integer>set,int[] d){
        if(index==3){
            if(sum%2==0)set.add(sum);
            return;
        }

        for(int i=0;i<d.length;i++){
            if(visit[i])continue;

            if(index==0 && d[i]==0)continue;

            if(index==2 && d[i]%2!=0)continue;

            visit[i]=true;
            help(index+1,sum*10+d[i],visit,set,d);
            visit[i]=false;

        }
    }
}