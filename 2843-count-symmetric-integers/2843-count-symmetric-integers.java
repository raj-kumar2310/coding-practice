class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;

        for(int i=low;i<=high;i++){
            if(i>9 && fun(i))ans++;
        }

        return ans;
    }

    static boolean fun(int n){
        List<Integer>l=new ArrayList<>();

        while(n>0){
            int t=n%10;
            l.add(t);
            n/=10;
        }
        if(l.size()%2!=0)return false;
        int ls=0,rs=0;
        for(int i=0;i<l.size()/2;i++){
            ls+=l.get(i);
            
        }
        for(int i=l.size()/2;i<l.size();i++){
            rs+=l.get(i);

        }

        return ls==rs;
    };
}