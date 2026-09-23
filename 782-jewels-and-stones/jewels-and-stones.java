class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character>set=new HashSet<>();
        for(char i:jewels.toCharArray()){
            set.add(i);
        }
        int ans=0;

        for(char i:stones.toCharArray()){
            if(set.contains(i))ans++;
        }

        return ans;
    }
}