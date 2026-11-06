class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int l = 0, r = 0, ans = 0;

        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            while (map.size() > maxLetters) {
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }

                l++;

            }

            if ((r - l + 1) >= minSize) {
                String val = s.substring(r-minSize+1, r + 1);
                map2.put(val, map2.getOrDefault(val, 0) + 1);
            }

            r++;
        }
        for (int i : map2.values()) {
            ans = Math.max(i, ans);
        }
        return ans;
    }
}