class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int l=nums1.length+nums2.length;
        int n[]=new int[l];
       n=IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).sorted().toArray();
       if(l%2==1)
       {
         return n[l/2];
       }
       else
       {
       int mid1=(l/2)-1;
        int mid2=l/2;
        return(double) (n[mid1]+n[mid2])/2.0;
       }
    }
}