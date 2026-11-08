class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(helper(s, k, 'F'), helper(s, k, 'T'));
    }

    int helper(String s, int k, char ch) {
        int l = 0, r = 0;
        int t = 0, ans = Integer.MIN_VALUE;
        while (r < s.length()) {
            if (ch == s.charAt(r)) {
                t++;
            }

            while (t > k) {
                if (ch == s.charAt(l)) {
                    t--;
                }
                l++;

            }

            ans = Math.max(r - l + 1, ans);

            r++;
        }

        return ans;
    }
}