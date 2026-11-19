class Solution {
    public void solveSudoku(char[][] mat) {
        fun(mat);
    }
    static boolean fun(char[][] mat){
         int r=-1;
        int c=-1;
        boolean empty=true;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]=='.'){
                    r=i;
                    c=j;
                    empty=false;
                    break;
                }
            }

            if(!empty)break;
        }

        if(empty)return true;

        for(int i=1;i<=9;i++){
            char ch=(char)(i+'0');
            if(safe(ch,r,c,mat)){
                mat[r][c]=ch;
                if(fun(mat)){
                    return true;
                }else{
                    mat[r][c]='.';
                }
            }
        }

        return false;
        
    }

    static boolean safe(char num,int r,int c,char[][] mat){
        for(int i=0;i<mat.length;i++){
            if(mat[r][i]==num || mat[i][c]==num)return false;
        }

        int sq=(int)Math.sqrt(mat.length);

        int sr=r-r%sq;
        int sc=c-c%sq;

        for(int i=sr;i<sr+sq;i++){
            for(int j=sc;j<sc+sq;j++){
                if(mat[i][j]==num)return false;
            }
        }

        return true;
    }
}