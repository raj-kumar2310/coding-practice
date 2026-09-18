class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();

        if(n!=m)return false;

        int[] a=new int[26];

        for(int i=0;i<n;i++){
            a[word1.charAt(i)-'a']++;
            a[word2.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(a[i] >3 || a[i] <-3)return false;
        }

        return true;
    }
}