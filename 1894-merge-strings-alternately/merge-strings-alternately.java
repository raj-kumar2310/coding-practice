class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder sb=new StringBuilder();

        int i=0;

        while(i<w1.length() && i<w2.length()){
            sb.append(w1.charAt(i));
            sb.append(w2.charAt(i));
            i++;
        }

        if(i<w1.length()){
            sb.append(w1.substring(i));
        }else if(i<w2.length()){

            sb.append(w2.substring(i));
        }

        return sb.toString();
    }
}