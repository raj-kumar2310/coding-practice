class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer>map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        List<String>s=new ArrayList<>();

        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){

                int cs=map.get(list2[i])+i;

                if(cs<min){
                    s.clear();
                s.add(list2[i]);
                min=map.get(list2[i])+i;
                }else if(cs==min){
                s.add(list2[i]);

                }
            }

            System.out.println(min);
        }

        String[] ans=new String[s.size()];

        for(int i=0;i<s.size();i++){
            ans[i]=s.get(i);
        }


        return ans;

    }
}