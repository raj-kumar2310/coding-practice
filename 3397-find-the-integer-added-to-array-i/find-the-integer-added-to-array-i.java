class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;

        for(int i:nums1)m1=Math.min(m1,i);
        for(int i:nums2)m2=Math.min(m2,i);

        return m2-m1;
    }
}