class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())return false;


        int n=s.length();

        if(s.equals(goal)){
        boolean[] a=new boolean[26];
            for(char i:s.toCharArray()){
                if(a[i-'a'])return true;
                a[i-'a']=true;
            }

            return false;
        }
        int f=-1,se=-1;

        for(int i=0;i<n;i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(f==-1){
                    f=i;
                }else if(se==-1){
                    se=i;
                }else{
                    return false;
                }
            }

        }



        
        return se!=-1 && s.charAt(f)==goal.charAt(se)&&s.charAt(se)==goal.charAt(f);


    }
}