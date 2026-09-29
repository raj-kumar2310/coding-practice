class Solution {
    public int balancedStringSplit(String s) {
        int balance=0,count=0;

        for(char i:s.toCharArray()){
            if(i=='L'){
                balance++;
            }else{
                balance--;
            }

            if(balance==0)count++;
        }

        return count;
    }
}