class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer,Integer>map=new LinkedHashMap<>();

        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int ans=0;

        for(Map.Entry<Integer,Integer>ent:map.entrySet()){
            if(ent.getValue()==1){
            ans=ent.getKey();
            break;

            }
            ans=-1;
        }

        return ans==0?-1:ans;
    }
}