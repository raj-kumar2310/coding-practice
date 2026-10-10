class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;

        for(int i:arr){
            if(i==0){
                ans.add(0);
                ans.add(0);
            }else{
                ans.add(i);
            }
        }

        for(int i=0;i<n;i++){
            arr[i]=ans.get(i);
        }
        

    }
}