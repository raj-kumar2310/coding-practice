class Solution {
    public int divisorSubstrings(int num, int k) {
     String a=String.valueOf(num);

     int l=0,r=0,ans=0;
    StringBuilder sb=new StringBuilder();

     while(r<a.length()){
        sb.append(a.charAt(r));

        if(l<a.length()&&sb.length() > k){
            sb.deleteCharAt(0);
            l++;
        }

        if(sb.length()==k){

        int n=Integer.parseInt(sb.toString());

        if( n!=0&&num%n==0)ans++;

        }
        r++;
       
     }

     return ans;


    }
}