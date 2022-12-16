class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
         int minCost1=cost[0],minCost2=cost[1],minCost=0;
        for(int i=0;i<=cost.length;i++)
        {
            if(i==0)
            {minCost1 = 0;
             minCost=cost[i];
            }  
            else if(i==1){
                minCost2=0;
                minCost=cost[i];
            }
            else{
                minCost=Math.min(minCost1+cost[i-2],minCost2+cost[i-1]);
                minCost1=minCost2;
                minCost2=minCost;
            }
        }
        return minCost;
    }
}
