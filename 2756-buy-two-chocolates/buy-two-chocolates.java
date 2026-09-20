class Solution {
    public int buyChoco(int[] p, int mon) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        

        for(int i=0;i<p.length;i++){
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