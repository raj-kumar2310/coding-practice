class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int l = 0, r = 0;
        int ans = 0;
        int t = 0;

        while (r < arr.length) {
            if (arr[r] == 'a' || arr[r] == 'e' || arr[r] == 'i' || arr[r] == 'o' || arr[r] == 'u') {
                t++;

            }

            System.out.println(t);

            while (r - l + 1 > k) {
                if (arr[l] == 'a' || arr[l] == 'e' || arr[l] == 'i' || arr[l] == 'o' || arr[l] == 'u') {
                    t--;

                }
                l++;
            }

            ans=Math.max(t,ans);

            r++;
        }
        return ans;
    }
}