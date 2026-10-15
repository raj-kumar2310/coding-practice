class Solution {
    public String firstPalindrome(String[] words) {
        for(String i:words){
            if(palindrome(i)){
                return i;
        
            }
        }

        return "";
    }
    static boolean palindrome(String s){
        int l=0,h=s.length()-1;

        while(l<=h){
            if(s.charAt(l)!=s.charAt(h))return false;
            l++;

            h--;
        }

        return true;
    }
}