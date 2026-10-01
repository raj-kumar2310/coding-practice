class Solution {
    public boolean digitCount(String num) {
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<num.length();i++){
            int a=num.charAt(i)-'0';
            map.put(a,map.getOrDefault(a,0)+1);
        }


        for(int i=0;i<num.length();i++){
            int a=num.charAt(i)-'0';


            if(map.get(i)==null && a!=0){
                return false;
            }
            else if(map.get(i)!=null &&map.get(i) != a){
                return false;
            }
        }

        return true;

    }
}