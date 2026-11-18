class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr);
        List<Integer>p=new ArrayList<>();
        help(0,t,arr,ans,p);
        return ans;
    }

    static void help(int index,int t,int[] arr,List<List<Integer>>ans,List<Integer>p){
            if(t==0){
                ans.add(new ArrayList<>(p));

            return;
            }
        

        for(int i=index;i<arr.length;i++){
            if(i > index && arr[i]==arr[i-1])continue;
            if(arr[i] > t)continue;

            p.add(arr[i]);
            System.out.println(t-arr[i]);
            help(i+1,t-arr[i],arr,ans,p);
            p.removeLast();
        }
    }
}