class Solution {
    public boolean validPalindrome(String s) {

        int st=0,en=s.length()-1;

        while(st<en){
            if(s.charAt(st) != s.charAt(en)){
                return isPalin(s,st+1,en)||isPalin(s,st,en-1);
            }
            st++;en--;
            
        }

        return true;
    }
    static boolean isPalin(String s,int st,int en){
        while(st<=en){
            if(s.charAt(st++) != s.charAt(en--))return false;
        }

        return true;
    }
}