class Solution {
    public String removeDigit(String s, char d) {
        int ri=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==d){
                ri=i;

                if(i+1 < s.length() && s.charAt(i+1) > d){
                    break;
                }
            }
        }



        return s.substring(0,ri)+s.substring(ri+1);
    }
}