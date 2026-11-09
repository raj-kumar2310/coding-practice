class Solution {
    public void reverseString(char[] s) {
        
        // int st=0,en=s.length-1;
        // while(st<en){
        //     char a=s[st];
        //     s[st]=s[en];
        //     s[en]=a;
        //     st++;
        //     en--;
        // }

        helper(s,0,s.length-1);
    }

    void helper(char[] arr,int l,int r){
        if(l>r){
            return;
        }

        char t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;

         helper(arr,l+1,--r);

    }
}