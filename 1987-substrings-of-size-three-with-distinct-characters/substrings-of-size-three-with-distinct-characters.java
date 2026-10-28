class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int l = 0, r = 0;

        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            if (r - l + 1 > 3) {
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l), 0) - 1);
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }

            if(map.size()==3 && r-l+1 ==3){
                ans++;
            }

            r++;
        }

        return ans;
    }
}