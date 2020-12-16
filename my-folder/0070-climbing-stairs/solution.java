class Solution {
    public int climbStairs(int n) {
        
        int[] noOfFloors=new int[n+1]; 
        if(n==0)
            return 0;
         if(n==1)
            return 1;
        else{
        noOfFloors[0]=0;
        noOfFloors[1]=1;
        noOfFloors[2]=2;
        }
        for(int i=3;i<=n;i++)
        {
            noOfFloors[i]=noOfFloors[i-1]+noOfFloors[i-2];
        }
        return noOfFloors[n];
    }
}
