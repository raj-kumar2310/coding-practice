class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int k = set.size();

        return atmost(nums, k)-atmost(nums,k-1);
    }

    static int atmost(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int l = 0, r = 0, count = 0;

        while (r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > k) {
                map.put(nums[l], map.getOrDefault(nums[l], 0) - 1);
                if (map.get(nums[l]) == 0)
                    map.remove(nums[l]);
                l++;
            }

            if(map.size() <=k){

            count+=(r-l+1);
            }
            r++;
        }

        return count;
    }
}