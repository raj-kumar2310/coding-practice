class Solution {
    public int calPoints(String[] s) {
        List<Integer>l=new ArrayList<>();

        for(String i:s){
            if(i.equals("+")){
                int a=l.get(l.size()-1)+l.get(l.size()-2);
                l.add(a);
            }else if(i.equals("D")){
                int a=l.get(l.size()-1)*2;
                l.add(a);
            }else if(i.equals("C")){
                l.removeLast();
            }else{
                int a=Integer.parseInt(i);
                l.add(a);
            }
        }

        int ans=0;
        for(int i:l)ans+=i;

        return ans;
    }
}