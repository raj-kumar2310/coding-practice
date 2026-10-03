class Solution {
    public int dayOfYear(String date) {
        int[] month={31,28,31,30,31,30,31,31,30,31,30,31};

        int year=Integer.parseInt(date.substring(0,4));
        int mon=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8,10));

        if(leap(year)){
            month[1]=29;
        }
        int tot=0;
        for(int i=0;i<mon-1;i++){
            tot+=month[i];
        }

        tot+=day;

        return tot;
    }

    static boolean leap(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
}