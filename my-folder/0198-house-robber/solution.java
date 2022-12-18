class Solution {
    public int rob(int[] cost) {
        int maxAllowedPrevSum=0,maxPreviousSum=0,total=0;
        for(int i=0;i<=cost.length-1;i++)
        {if(i==0)
            {
                maxAllowedPrevSum += cost[i];
                total=maxAllowedPrevSum;
            }
            else if(i==1){
               maxPreviousSum += cost[i];
               total=Math.max(maxAllowedPrevSum,maxPreviousSum);
            }
            else{
                total=Math.max(maxAllowedPrevSum+cost[i],maxPreviousSum);
                maxAllowedPrevSum=Math.max(maxAllowedPrevSum,maxPreviousSum);
                maxPreviousSum=total;
            }
        }
        return total;
    }
}
