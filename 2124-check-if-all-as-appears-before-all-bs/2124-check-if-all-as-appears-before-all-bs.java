class Solution {
    public boolean checkString(String s) {
        boolean f=true;

        for(char i:s.toCharArray()){
            if(i == 'b'){
                f=false;
            }

            if(!f && i=='a'){
                return false;
            }
        }
                return true;
    }
}