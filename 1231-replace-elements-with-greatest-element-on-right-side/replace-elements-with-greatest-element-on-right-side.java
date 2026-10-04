class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans=new int[arr.length];
        int m=-1;

        for(int i=arr.length-1;i>=0;i--){
            ans[i]=m;
            m=Math.max(m,arr[i]);
        }

        return ans;
    }
}