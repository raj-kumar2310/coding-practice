class Solution {
    public int buyChoco(int[] p, int mon) {
        int a=Math.min(p[0],p[1]);
        int b=Math.max(p[0],p[1]);
        

        for(int i=2;i<p.length;i++){
            if(p[i]<a){
                b=a;
                a=p[i];

            }else if(p[i] < b){
                b=p[i];
            }
        }

        System.out.println(a+" "+b);


        if(a+b > mon )return mon;

        return mon-(a+b); 
    }
}