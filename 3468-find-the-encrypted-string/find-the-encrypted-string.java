class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();


        for(int i=0;i<n;i++){
            
            //find index
            int a=(i+k)%n;

            ans.append(s.charAt(a));
        }

        return ans.toString();
    }
}