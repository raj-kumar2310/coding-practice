class Solution {
    public boolean isPrefixString(String s, String[] words) {
     String a="";

     for(String word:words){
        a+=word;
        if(s.equals(a))return true;
     }

     return false;   
    }


}