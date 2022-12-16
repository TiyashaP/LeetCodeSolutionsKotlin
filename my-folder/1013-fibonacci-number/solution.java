class Solution {
    public int fib(int n) {
        int a=0,b=1,res=0;
        for(int i=0;i<=n;i++)
        {
            if(i==0 || i==1)
                res=i;
            else{
                res=a+b;
                a=b;
                b=res;
            }
        }
        return res;
        
    }
}
