class Solution {
    public int climbStairs(int n) {
        
         int a=1,b=2,res=0;
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==2)
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
    
