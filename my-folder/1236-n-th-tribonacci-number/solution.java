class Solution {
    public int tribonacci(int n) {
         int a=0,b=1,c=1,res=0;
        for(int i=0;i<=n;i++)
        {
            if(i==0 || i==1)
                res=i;
            else if(i==2)
                res=1;
            else{
                res=a+b+c;
                a=b;
                b=c;
                c=res;
            }
        }
        return res;
        
        
    }
}
