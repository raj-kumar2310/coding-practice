class Solution {
    public String generateTheString(int n) {
        
        if(n%2==1){
            String a="";

            for(int i=0;i<n;i++){
                a+="a";
            }

            return a;
        }


            String a="";

            for(int i=0;i<n-1;i++){
                a+="a";
            }

                a+="z";
            return a;
        

    }
}
